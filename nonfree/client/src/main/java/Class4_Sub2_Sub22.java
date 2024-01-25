import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class4_Sub2_Sub22 extends Class4_Sub2 {

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "I")
	private int anInt7765 = 0;

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
	private int anInt7772 = 4096;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(21) int[] local21 = this.method8208(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static417.anInt5248; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (this.anInt7765 > local29) {
					local11[local23] = this.anInt7765;
				} else if (local29 <= this.anInt7772) {
					local11[local23] = local29;
				} else {
					local11[local23] = this.anInt7772;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(23) int[][] local23 = this.method8202(arg0, 0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local13[0];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local13[2];
			for (@Pc(49) int local49 = 0; local49 < Static417.anInt5248; local49++) {
				@Pc(55) int local55 = local27[local49];
				@Pc(59) int local59 = local31[local49];
				@Pc(63) int local63 = local35[local49];
				if (this.anInt7765 > local55) {
					local39[local49] = this.anInt7765;
				} else if (local55 <= this.anInt7772) {
					local39[local49] = local55;
				} else {
					local39[local49] = this.anInt7772;
				}
				if (this.anInt7765 > local59) {
					local43[local49] = this.anInt7765;
				} else if (local59 > this.anInt7772) {
					local43[local49] = this.anInt7772;
				} else {
					local43[local49] = local59;
				}
				if (local63 < this.anInt7765) {
					local47[local49] = this.anInt7765;
				} else if (local63 > this.anInt7772) {
					local47[local49] = this.anInt7772;
				} else {
					local47[local49] = local63;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7765 = arg0.method7054();
		} else if (arg1 == 1) {
			this.anInt7772 = arg0.method7054();
		} else if (arg1 == 2) {
			super.aBoolean713 = arg0.method7004() == 1;
		}
	}
}
