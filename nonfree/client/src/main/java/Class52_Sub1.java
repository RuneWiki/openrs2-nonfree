import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!cfa", name = "I", descriptor = "I")
	private int anInt1367;

	@OriginalMember(owner = "client!cfa", name = "J", descriptor = "[I")
	private int[] anIntArray135;

	@OriginalMember(owner = "client!cfa", name = "K", descriptor = "[[B")
	private final byte[][] aByteArrayArray3 = new byte[10][];

	@OriginalMember(owner = "client!cfa", name = "L", descriptor = "Lclient!ud;")
	private final Class2_Sub34 aClass2_Sub34_3 = new Class2_Sub34(null);

	@OriginalMember(owner = "client!cfa", name = "N", descriptor = "Lclient!ud;")
	private final Class2_Sub34 aClass2_Sub34_4 = new Class2_Sub34(null);

	@OriginalMember(owner = "client!cfa", name = "G", descriptor = "Lclient!eq;")
	private final Class97 aClass97_11;

	@OriginalMember(owner = "client!cfa", name = "F", descriptor = "I")
	private final int anInt1366;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(ILclient!eq;I)V")
	public Class52_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass97_11 = arg1;
		this.anInt1366 = arg2;
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(Z)V")
	public void method1232() {
		if (this.anIntArray135 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			if (this.anInt1367 + local15 >= this.anIntArray135.length) {
				return;
			}
			if (this.aByteArrayArray3[local15] == null && this.aClass97_11.method2561(this.anIntArray135[local15 + this.anInt1367], 0)) {
				this.aByteArrayArray3[local15] = this.aClass97_11.method2545(0, this.anIntArray135[local15 + this.anInt1367]);
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I[B)I")
	@Override
	protected int method1219(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(54) int local54;
		@Pc(60) int local60;
		if (this.anIntArray135 == null) {
			if (!this.aClass97_11.method2561(this.anInt1366, 0)) {
				return 0;
			}
			@Pc(34) byte[] local34 = this.aClass97_11.method2545(0, this.anInt1366);
			if (local34 == null) {
				throw new IllegalStateException("");
			}
			this.aClass2_Sub34_4.aByteArray77 = local34;
			this.aClass2_Sub34_4.anInt8188 = 0;
			local54 = local34.length >> 1;
			this.anIntArray135 = new int[local54];
			for (local60 = 0; local60 < local54; local60++) {
				this.anIntArray135[local60] = this.aClass2_Sub34_4.method6884();
			}
		}
		if (this.anInt1367 >= this.anIntArray135.length) {
			return -1;
		}
		this.method1232();
		this.aClass2_Sub34_4.aByteArray77 = arg0;
		this.aClass2_Sub34_4.anInt8188 = 0;
		do {
			if (this.aClass2_Sub34_4.anInt8188 >= this.aClass2_Sub34_4.aByteArray77.length) {
				this.aClass2_Sub34_4.aByteArray77 = null;
				return arg0.length;
			}
			if (this.aClass2_Sub34_3.aByteArray77 == null) {
				if (this.aByteArrayArray3[0] == null) {
					this.aClass2_Sub34_4.aByteArray77 = null;
					return this.aClass2_Sub34_4.anInt8188;
				}
				this.aClass2_Sub34_3.aByteArray77 = this.aByteArrayArray3[0];
			}
			@Pc(129) int local129 = this.aClass2_Sub34_4.aByteArray77.length - this.aClass2_Sub34_4.anInt8188;
			local54 = this.aClass2_Sub34_3.aByteArray77.length - this.aClass2_Sub34_3.anInt8188;
			if (local54 > local129) {
				this.aClass2_Sub34_3.method6891(this.aClass2_Sub34_4.aByteArray77, local129, this.aClass2_Sub34_4.anInt8188);
				this.aClass2_Sub34_4.aByteArray77 = null;
				return arg0.length;
			}
			this.aClass2_Sub34_4.method6914(this.aClass2_Sub34_3.anInt8188, this.aClass2_Sub34_3.aByteArray77, local54);
			this.aClass2_Sub34_3.aByteArray77 = null;
			this.aClass2_Sub34_3.anInt8188 = 0;
			this.anInt1367++;
			for (local60 = 0; local60 < 9; local60++) {
				this.aByteArrayArray3[local60] = this.aByteArrayArray3[local60 + 1];
			}
			this.aByteArrayArray3[9] = null;
		} while (this.anIntArray135.length > this.anInt1367);
		this.aClass2_Sub34_4.aByteArray77 = null;
		return this.aClass2_Sub34_4.anInt8188;
	}
}
