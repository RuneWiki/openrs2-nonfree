import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class2_Sub11_Sub3 extends Class2_Sub11 {

	@OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
	private int anInt2093;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11_Sub3(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2093 = 4096;
		this.anInt2093 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub3() {
		this(4096);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2093 = (arg1.method8581(-17416) << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			Static728.method275(local18, 0, Static301.anInt10214, this.anInt2093);
		}
		return local18;
	}
}
