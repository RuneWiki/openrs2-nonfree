import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!aq", name = "K", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!aq", name = "L", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
	private int anInt251;

	@OriginalMember(owner = "client!aq", name = "P", descriptor = "I")
	private int anInt253 = -1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub1() {
		super(0, false);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt253 = arg1.method5028();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	@Override
	public void method6042() {
		super.method6042();
		this.anIntArray13 = null;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)I")
	@Override
	public int method6039() {
		return this.anInt253;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(43) int local43 = this.anInt251 * (this.anInt249 == Static91.anInt1740 ? arg0 : arg0 * this.anInt249 / Static91.anInt1740);
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			@Pc(61) int local61;
			@Pc(69) int local69;
			if (this.anInt251 == Static419.anInt6404) {
				for (local61 = 0; local61 < Static419.anInt6404; local61++) {
					local69 = this.anIntArray13[local43++];
					local55[local61] = (local69 & 0xFF) << 4;
					local51[local61] = local69 >> 4 & 0xFF0;
					local47[local61] = local69 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static419.anInt6404; local61++) {
					local69 = this.anInt251 * local61 / Static419.anInt6404;
					@Pc(121) int local121 = this.anIntArray13[local69 + local43];
					local55[local61] = (local121 & 0xFF) << 4;
					local51[local61] = local121 >> 4 & 0xFF0;
					local47[local61] = local121 >> 12 & 0xFF0;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(III)V")
	@Override
	public void method6041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method6041(arg0, arg1);
		if (this.anInt253 >= 0 && Static380.anInterface5_6 != null) {
			@Pc(27) int local27 = Static380.anInterface5_6.method4079(this.anInt253).aBoolean188 ? 64 : 128;
			this.anIntArray13 = Static380.anInterface5_6.method4078(false, local27, 1.0F, local27, this.anInt253);
			this.anInt249 = local27;
			this.anInt251 = local27;
		}
	}
}
