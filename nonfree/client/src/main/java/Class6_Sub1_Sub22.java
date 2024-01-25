import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class6_Sub1_Sub22 extends Class6_Sub1 {

	@OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
	private int anInt7194;

	@OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
	private int anInt7196;

	@OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
	private int anInt7197;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V")
	private Class6_Sub1_Sub22(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method6023(arg0);
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub22() {
		this(0);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static53.anInt1787; local35++) {
				local25[local35] = this.anInt7194;
				local29[local35] = this.anInt7197;
				local33[local35] = this.anInt7196;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(II)V")
	private void method6023(@OriginalArg(1) int arg0) {
		this.anInt7197 = arg0 >> 4 & 0xFF0;
		this.anInt7196 = (arg0 & 0xFF) << 4;
		this.anInt7194 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.method6023(arg1.method8203());
		}
	}
}
