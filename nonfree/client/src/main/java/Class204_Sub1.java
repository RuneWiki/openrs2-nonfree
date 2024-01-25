import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class204_Sub1 extends Class204 {

	@OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
	private int anInt7626;

	@OriginalMember(owner = "client!pl", name = "Q", descriptor = "[I")
	private int[] anIntArray513;

	@OriginalMember(owner = "client!pl", name = "T", descriptor = "[[B")
	private final byte[][] aByteArrayArray23 = new byte[10][];

	@OriginalMember(owner = "client!pl", name = "L", descriptor = "Lclient!gga;")
	private final Class6_Sub23 aClass6_Sub23_5 = new Class6_Sub23((byte[]) null);

	@OriginalMember(owner = "client!pl", name = "V", descriptor = "Lclient!gga;")
	private final Class6_Sub23 aClass6_Sub23_6 = new Class6_Sub23((byte[]) null);

	@OriginalMember(owner = "client!pl", name = "R", descriptor = "Lclient!ae;")
	private final Class8 aClass8_108;

	@OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
	private final int anInt7627;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(ILclient!ae;I)V")
	public Class204_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass8_108 = arg1;
		this.anInt7627 = arg2;
	}

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "(I)V")
	public void method6611() {
		if (this.anIntArray513 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			if (this.anIntArray513.length <= local15 + this.anInt7626) {
				return;
			}
			if (this.aByteArrayArray23[local15] == null && this.aClass8_108.method275(0, this.anIntArray513[local15 + this.anInt7626])) {
				this.aByteArrayArray23[local15] = this.aClass8_108.method262(0, this.anIntArray513[local15 + this.anInt7626]);
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([BI)I")
	@Override
	protected int method6603(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray513 == null) {
			if (!this.aClass8_108.method275(0, this.anInt7627)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass8_108.method262(0, this.anInt7627);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass6_Sub23_6.anInt9901 = 0;
			this.aClass6_Sub23_6.aByteArray101 = local26;
			local46 = local26.length >> 1;
			this.anIntArray513 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray513[local52] = this.aClass6_Sub23_6.method8363();
			}
		}
		if (this.anIntArray513.length <= this.anInt7626) {
			return -1;
		}
		this.method6611();
		this.aClass6_Sub23_6.anInt9901 = 0;
		this.aClass6_Sub23_6.aByteArray101 = arg0;
		do {
			if (this.aClass6_Sub23_6.anInt9901 >= this.aClass6_Sub23_6.aByteArray101.length) {
				this.aClass6_Sub23_6.aByteArray101 = null;
				return arg0.length;
			}
			if (this.aClass6_Sub23_5.aByteArray101 == null) {
				if (this.aByteArrayArray23[0] == null) {
					this.aClass6_Sub23_6.aByteArray101 = null;
					return this.aClass6_Sub23_6.anInt9901;
				}
				this.aClass6_Sub23_5.aByteArray101 = this.aByteArrayArray23[0];
			}
			@Pc(120) int local120 = this.aClass6_Sub23_6.aByteArray101.length - this.aClass6_Sub23_6.anInt9901;
			local46 = this.aClass6_Sub23_5.aByteArray101.length - this.aClass6_Sub23_5.anInt9901;
			if (local46 > local120) {
				this.aClass6_Sub23_5.method8375(local120, this.aClass6_Sub23_6.aByteArray101, this.aClass6_Sub23_6.anInt9901);
				this.aClass6_Sub23_6.aByteArray101 = null;
				return arg0.length;
			}
			this.aClass6_Sub23_6.method8358(this.aClass6_Sub23_5.aByteArray101, this.aClass6_Sub23_5.anInt9901, local46);
			this.aClass6_Sub23_5.anInt9901 = 0;
			this.aClass6_Sub23_5.aByteArray101 = null;
			this.anInt7626++;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray23[local52] = this.aByteArrayArray23[local52 + 1];
			}
			this.aByteArrayArray23[9] = null;
		} while (this.anIntArray513.length > this.anInt7626);
		this.aClass6_Sub23_6.aByteArray101 = null;
		return this.aClass6_Sub23_6.anInt9901;
	}
}
