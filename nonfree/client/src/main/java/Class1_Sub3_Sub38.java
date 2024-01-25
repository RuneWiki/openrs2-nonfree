import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class1_Sub3_Sub38 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
	private int anInt8490 = 1024;

	@OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
	private int anInt8495 = 2048;

	@OriginalMember(owner = "client!ut", name = "M", descriptor = "I")
	private int anInt8498 = 3072;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8490 = arg0.method3967();
		} else if (arg1 == 1) {
			this.anInt8498 = arg0.method3967();
		} else if (arg1 == 2) {
			super.aBoolean614 = arg0.method3922() == 1;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(27) int[][] local27 = this.method7130(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static452.anInt7734; local53++) {
				local43[local53] = this.anInt8490 + (this.anInt8495 * local31[local53] >> 12);
				local47[local53] = this.anInt8490 + (local35[local53] * this.anInt8495 >> 12);
				local51[local53] = this.anInt8490 + (local39[local53] * this.anInt8495 >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		this.anInt8495 = this.anInt8498 - this.anInt8490;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(21) int[] local21 = this.method7128(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static452.anInt7734; local23++) {
				local11[local23] = this.anInt8490 + (local21[local23] * this.anInt8495 >> 12);
			}
		}
		return local11;
	}
}
