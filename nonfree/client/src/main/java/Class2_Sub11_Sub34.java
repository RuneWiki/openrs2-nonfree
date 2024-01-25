import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class2_Sub11_Sub34 extends Class2_Sub11 {

	@OriginalMember(owner = "client!vda", name = "F", descriptor = "I")
	private int anInt10427 = 4096;

	@OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
	private int anInt10428 = 0;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(27) int[] local27 = this.method9540(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static301.anInt10214; local29++) {
				@Pc(35) int local35 = local27[local29];
				local11[local29] = this.anInt10428 <= local35 && local35 <= this.anInt10427 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt10428 = arg1.method8575();
		} else if (arg0 == 1) {
			this.anInt10427 = arg1.method8575();
		}
	}
}
