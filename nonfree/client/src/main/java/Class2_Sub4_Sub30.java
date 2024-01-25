import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class2_Sub4_Sub30 extends Class2_Sub4 {

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
	private int anInt7660;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
	public Class2_Sub4_Sub30(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt7660 = 4096;
		this.anInt7660 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub30() {
		this(4096);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			Static598.method4260(local9, 0, Static143.anInt7434, this.anInt7660);
		}
		return local9;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt7660 = (arg1.method4464() << 12) / 255;
		}
	}
}
