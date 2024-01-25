import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class12_Sub1_Sub12 extends Class12_Sub1 {

	@OriginalMember(owner = "client!gea", name = "G", descriptor = "I")
	private int anInt3404 = 1024;

	@OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
	private int anInt3405 = 3072;

	@OriginalMember(owner = "client!gea", name = "N", descriptor = "I")
	private int anInt3410 = 2048;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)V")
	@Override
	public void method7797() {
		this.anInt3410 = this.anInt3405 - this.anInt3404;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3404 = arg0.method5199();
		} else if (arg1 == 1) {
			this.anInt3405 = arg0.method5199();
		} else if (arg1 == 2) {
			super.aBoolean663 = arg0.method5216() == 1;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(25) int[] local25 = this.method7795(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static357.anInt6670; local27++) {
				local11[local27] = this.anInt3404 + (local25[local27] * this.anInt3410 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(27) int[][] local27 = this.method7790(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static357.anInt6670; local53++) {
				local43[local53] = this.anInt3404 + (this.anInt3410 * local31[local53] >> 12);
				local47[local53] = (this.anInt3410 * local35[local53] >> 12) + this.anInt3404;
				local51[local53] = (local39[local53] * this.anInt3410 >> 12) + this.anInt3404;
			}
		}
		return local11;
	}
}
