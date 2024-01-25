import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class6_Sub40_Sub2 extends Class6_Sub40 {

	@OriginalMember(owner = "client!vt", name = "Jb", descriptor = "Lclient!hd;")
	private Class126 aClass126_2;

	@OriginalMember(owner = "client!vt", name = "Rb", descriptor = "I")
	private int anInt10199;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(I)V")
	public Class6_Sub40_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "(B)V")
	public void method8618() {
		this.anInt10199 = super.anInt10169 * 8;
	}

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "(II)I")
	public int method8619(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = this.anInt10199 >> 3;
		@Pc(24) int local24 = 8 - (this.anInt10199 & 0x7);
		@Pc(26) int local26 = 0;
		this.anInt10199 += arg0;
		while (local24 < arg0) {
			local26 += (Static48.anIntArray59[local24] & super.aByteArray113[local17++]) << arg0 - local24;
			arg0 -= local24;
			local24 = 8;
		}
		if (local24 == arg0) {
			local26 += super.aByteArray113[local17] & Static48.anIntArray59[local24];
		} else {
			local26 += super.aByteArray113[local17] >> local24 - arg0 & Static48.anIntArray59[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "(B)I")
	public int method8620() {
		@Pc(26) int local26 = super.aByteArray113[super.anInt10169++] - this.aClass126_2.method3545() & 0xFF;
		return local26 < 128 ? local26 : (local26 - 128 << 8) + (super.aByteArray113[super.anInt10169++] - this.aClass126_2.method3545() & 0xFF);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([BIII)V")
	public void method8621(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray113[super.anInt10169++] - this.aClass126_2.method3545());
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!hd;)V")
	public void method8622(@OriginalArg(1) Class126 arg0) {
		this.aClass126_2 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "([II)V")
	public void method8624(@OriginalArg(0) int[] arg0) {
		this.aClass126_2 = new Class126(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "(II)V")
	public void method8626(@OriginalArg(0) int arg0) {
		super.aByteArray113[super.anInt10169++] = (byte) (this.aClass126_2.method3545() + arg0);
	}

	@OriginalMember(owner = "client!vt", name = "r", descriptor = "(I)Z")
	public boolean method8627() {
		@Pc(21) int local21 = super.aByteArray113[super.anInt10169] - this.aClass126_2.method3544() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "(II)I")
	public int method8630(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt10199;
	}

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "(B)V")
	public void method8631() {
		super.anInt10169 = (this.anInt10199 + 7) / 8;
	}
}
