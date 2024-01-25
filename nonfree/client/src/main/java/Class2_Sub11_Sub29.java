import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class2_Sub11_Sub29 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
	private int anInt9810;

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
	private int anInt9812;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
	private int anInt9814;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
	private Class2_Sub11_Sub29(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method8669(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub29() {
		this(0);
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			for (@Pc(39) int local39 = 0; local39 < Static301.anInt10214; local39++) {
				local29[local39] = this.anInt9810;
				local33[local39] = this.anInt9814;
				local37[local39] = this.anInt9812;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.method8669(arg1.method8583());
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V")
	private void method8669(@OriginalArg(1) int arg0) {
		this.anInt9812 = (arg0 & 0xFF) << 4;
		this.anInt9814 = arg0 >> 4 & 0xFF0;
		this.anInt9810 = arg0 >> 12 & 0xFF0;
	}
}
