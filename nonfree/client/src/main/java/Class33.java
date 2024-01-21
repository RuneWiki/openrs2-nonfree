import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class33 {

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "[J")
	public static final long[] aLongArray5 = new long[256];

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	private int anInt1313;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	private int anInt1315;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Ljava/io/DataInputStream;")
	private DataInputStream aDataInputStream1;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[B")
	private final byte[] aByteArray5 = new byte[4];

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!wg;")
	private final Class94 aClass94_1;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
	private int anInt1314;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "J")
	private final long aLong45;

	static {
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(18) long local18 = (long) local14;
			for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
				if ((local18 & 0x1L) == 1L) {
					local18 = local18 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local18 >>>= 0x1;
				}
			}
			aLongArray5[local14] = local18;
		}
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!na;Ljava/net/URL;)V")
	public Class33(@OriginalArg(0) Class61 arg0, @OriginalArg(1) URL arg1) {
		this.aClass94_1 = arg0.method1789(arg1);
		this.anInt1314 = 0;
		this.aLong45 = Static86.method1251() + 30000L;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)[B")
	public byte[] method886() throws IOException {
		if (Static86.method1251() > this.aLong45) {
			throw new IOException("fdt");
		}
		if (this.anInt1314 == 0) {
			if (this.aClass94_1.anInt4472 == 2) {
				throw new IOException("fds");
			}
			if (this.aClass94_1.anInt4472 == 1) {
				this.aDataInputStream1 = (DataInputStream) this.aClass94_1.anObject3;
				this.anInt1314 = 1;
			}
		}
		@Pc(66) int local66;
		if (this.anInt1314 == 1) {
			local66 = this.aDataInputStream1.available();
			if (local66 > 0) {
				if (local66 + this.anInt1313 > 4) {
					local66 = 4 - this.anInt1313;
				}
				this.anInt1313 += this.aDataInputStream1.read(this.aByteArray5, this.anInt1313, local66);
				if (this.anInt1313 == 4) {
					@Pc(108) int local108 = (new Class3_Sub17(this.aByteArray5)).method2132();
					this.aByteArray4 = new byte[local108];
					this.anInt1314 = 2;
				}
			}
		}
		if (this.anInt1314 == 2) {
			local66 = this.aDataInputStream1.available();
			if (local66 > 0) {
				if (this.aByteArray4.length < local66 + this.anInt1315) {
					local66 = this.aByteArray4.length - this.anInt1315;
				}
				this.anInt1315 += this.aDataInputStream1.read(this.aByteArray4, this.anInt1315, local66);
				if (this.aByteArray4.length == this.anInt1315) {
					return this.aByteArray4;
				}
			}
		}
		return null;
	}
}
