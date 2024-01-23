import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub2() {
		this(0);
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I)V")
	private Class1_Sub4_Sub2(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method271(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(25) int[] local25 = local17[1];
			@Pc(29) int[] local29 = local17[0];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static182.anInt3492; local35++) {
				local29[local35] = this.anInt311;
				local25[local35] = this.anInt308;
				local33[local35] = this.anInt312;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method271(arg0.method1352());
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)V")
	private void method271(@OriginalArg(0) int arg0) {
		this.anInt312 = (arg0 & 0xFF) << 4;
		this.anInt308 = arg0 >> 4 & 0xFF0;
		this.anInt311 = arg0 >> 12 & 0xFF0;
	}
}
