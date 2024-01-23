import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
	private int anInt4154 = 3216;

	@OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
	private int anInt4157 = 4096;

	@OriginalMember(owner = "client!ta", name = "ob", descriptor = "I")
	private int anInt4166 = 3216;

	@OriginalMember(owner = "client!ta", name = "tb", descriptor = "[I")
	private int[] anIntArray313 = new int[3];

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(27) int local27 = this.anInt4157 * Static177.anInt3895 >> 12;
			@Pc(37) int[] local37 = this.method3733(Static148.anInt3213 & arg0 - 1, 0);
			@Pc(43) int[] local43 = this.method3733(arg0, 0);
			@Pc(53) int[] local53 = this.method3733(arg0 + 1 & Static148.anInt3213, 0);
			for (@Pc(55) int local55 = 0; local55 < Static157.anInt3431; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(74) int local74 = local70 >> 4;
				if (local74 < 0) {
					local74 = -local74;
				}
				if (local74 > 255) {
					local74 = 255;
				}
				@Pc(107) int local107 = (local43[Static74.anInt1679 & local55 - 1] - local43[local55 + 1 & Static74.anInt1679]) * local27 >> 12;
				@Pc(111) int local111 = local107 >> 4;
				if (local111 < 0) {
					local111 = -local111;
				}
				if (local111 > 255) {
					local111 = 255;
				}
				@Pc(135) int local135 = Class104.aByteArray43[local111 + (local74 * (local74 + 1) >> 1)] & 0xFF;
				@Pc(141) int local141 = local135 * local70 >> 8;
				@Pc(150) int local150 = local141 * this.anIntArray313[1] >> 12;
				@Pc(156) int local156 = local135 * 4096 >> 8;
				@Pc(165) int local165 = local156 * this.anIntArray313[2] >> 12;
				@Pc(171) int local171 = local135 * local107 >> 8;
				@Pc(180) int local180 = local171 * this.anIntArray313[0] >> 12;
				local11[local55] = local165 + local180 + local150;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
	private void method3224() {
		@Pc(15) double local15 = Math.cos((double) ((float) this.anInt4166 / 4096.0F));
		this.anIntArray313[0] = (int) (local15 * Math.sin((double) ((float) this.anInt4154 / 4096.0F)) * 4096.0D);
		this.anIntArray313[1] = (int) (local15 * 4096.0D * Math.cos((double) ((float) this.anInt4154 / 4096.0F)));
		this.anIntArray313[2] = (int) (Math.sin((double) ((float) this.anInt4166 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray313[2] * this.anIntArray313[2] >> 12;
		@Pc(85) int local85 = this.anIntArray313[1] * this.anIntArray313[1] >> 12;
		@Pc(97) int local97 = this.anIntArray313[0] * this.anIntArray313[0] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local97 + local85 + local73 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray313[2] = (this.anIntArray313[2] << 12) / local111;
			this.anIntArray313[0] = (this.anIntArray313[0] << 12) / local111;
			this.anIntArray313[1] = (this.anIntArray313[1] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4157 = arg0.method3805();
		} else if (arg1 == 1) {
			this.anInt4154 = arg0.method3805();
		} else if (arg1 == 2) {
			this.anInt4166 = arg0.method3805();
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		this.method3224();
	}
}
