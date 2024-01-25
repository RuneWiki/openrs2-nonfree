import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class12_Sub1_Sub5 extends Class12_Sub1 {

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
	private int anInt2000;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
	private int anInt2005;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
	private int anInt2009;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	private Class12_Sub1_Sub5(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method1855(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub5() {
		this(0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
	private void method1855(@OriginalArg(1) int arg0) {
		this.anInt2005 = arg0 >> 12 & 0xFF0;
		this.anInt2009 = arg0 >> 4 & 0xFF0;
		this.anInt2000 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static357.anInt6670; local35++) {
				local25[local35] = this.anInt2005;
				local29[local35] = this.anInt2009;
				local33[local35] = this.anInt2000;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1855(arg0.method5195());
		}
	}
}
