import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public abstract class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "B")
	public byte aByte130;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
	public int anInt10723;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
	public int anInt10724;

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
	public int anInt10725;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
	public int anInt10726;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	public int anInt10727;

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
	public int anInt10729;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "B")
	public byte aByte131;

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "Z")
	public boolean aBoolean728;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "Lclient!vs;")
	public Class20_Sub2 aClass20_Sub2_23;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "Z")
	public boolean aBoolean727 = false;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	protected Class20_Sub2() {
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	public abstract Class290 method9007(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[Lclient!raa;)I")
	public abstract int method9008(@OriginalArg(1) Class6_Sub1[] arg0);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[Lclient!raa;ZI)I")
	protected final int method9009(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static85.aLongArrayArrayArray1[this.aByte131][arg2][arg0];
		@Pc(21) long local21 = 0L;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		while (local21 <= 48L) {
			local33 = (int) (local14 >> (int) local21 & 0xFFFFL);
			if (local33 <= 0) {
				break;
			}
			local21 += 16L;
			arg1[local23++] = Static105.aClass68Array1[local33 - 1].aClass6_Sub1_1;
		}
		for (local33 = local23; local33 < 4; local33++) {
			arg1[local33] = null;
		}
		return local23;
	}

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)Z")
	public abstract boolean method9010();

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "(B)Z")
	public abstract boolean method9011();

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "(B)I")
	public int method9013() {
		return 0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBLclient!ha;I)Z")
	public abstract boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lclient!ha;I)Z")
	public abstract boolean method9015(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!ha;Z)V")
	public abstract void method9016(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)V")
	public abstract void method9017();

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!vs;ZILclient!ha;II)V")
	public abstract void method9018(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "(B)I")
	public abstract int method9019();

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	public abstract Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "(B)Z")
	public abstract boolean method9021();

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "(B)I")
	public abstract int method9022(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "(B)Z")
	public abstract boolean method9023();
}
