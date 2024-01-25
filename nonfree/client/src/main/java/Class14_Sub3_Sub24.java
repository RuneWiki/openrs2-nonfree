import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class14_Sub3_Sub24 extends Class14_Sub3 {

	@OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
	private int anInt3987;

	@OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
	private int anInt3988;

	@OriginalMember(owner = "client!mh", name = "Q", descriptor = "[I")
	private int[] anIntArray337;

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
	private int anInt3989 = -1;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub24() {
		super(0, false);
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V")
	@Override
	public void method5999() {
		super.method5999();
		this.anIntArray337 = null;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)I")
	@Override
	public int method5992() {
		return this.anInt3989;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3989 = arg0.method2498();
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BII)V")
	@Override
	public void method5993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method5993(arg0, arg1);
		if (this.anInt3989 >= 0 && Static224.anInterface2_5 != null) {
			@Pc(24) int local24 = Static224.anInterface2_5.method116(this.anInt3989).aBoolean292 ? 64 : 128;
			this.anIntArray337 = Static224.anInterface2_5.method119(this.anInt3989, 1.0F, local24, false, local24);
			this.anInt3988 = local24;
			this.anInt3987 = local24;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(43) int local43 = this.anInt3988 * (Static65.anInt5731 == this.anInt3987 ? arg0 : this.anInt3987 * arg0 / Static65.anInt5731);
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local19[1];
			@Pc(55) int[] local55 = local19[2];
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (Static294.anInt5657 == this.anInt3988) {
				for (local65 = 0; local65 < Static294.anInt5657; local65++) {
					local73 = this.anIntArray337[local43++];
					local55[local65] = (local73 & 0xFF) << 4;
					local51[local65] = local73 >> 4 & 0xFF0;
					local47[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static294.anInt5657; local65++) {
					local73 = local65 * this.anInt3988 / Static294.anInt5657;
					@Pc(121) int local121 = this.anIntArray337[local73 + local43];
					local55[local65] = (local121 & 0xFF) << 4;
					local51[local65] = local121 >> 4 & 0xFF0;
					local47[local65] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}
}
