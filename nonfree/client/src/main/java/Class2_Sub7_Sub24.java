import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class2_Sub7_Sub24 extends Class2_Sub7 {

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
	private int anInt5673 = 4096;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
	private int anInt5676 = 0;

	static {
		new Class202("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(27) int[] local27 = this.method7581(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static352.anInt6485; local29++) {
				@Pc(35) int local35 = local27[local29];
				local17[local29] = local35 >= this.anInt5676 && this.anInt5673 >= local35 ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt5676 = arg1.method5229();
		} else if (arg0 == 1) {
			this.anInt5673 = arg1.method5229();
		}
	}
}
