import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
	public int anInt9796;

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "Z")
	public boolean aBoolean687;

	@OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
	public int anInt9797;

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
	public int anInt9798;

	@OriginalMember(owner = "client!rda", name = "u", descriptor = "B")
	public byte aByte138;

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "B")
	public byte aByte139;

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "I")
	public int anInt9803;

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
	public int anInt9804;

	@OriginalMember(owner = "client!rda", name = "x", descriptor = "I")
	public int anInt9805;

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "Lclient!rda;")
	public Class4_Sub1 aClass4_Sub1_23;

	@OriginalMember(owner = "client!rda", name = "t", descriptor = "Z")
	public boolean aBoolean688 = false;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "()V")
	protected Class4_Sub1() {
	}

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(I)Z")
	public abstract boolean method8339();

	@OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)I")
	public abstract int method8341(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLclient!ha;)V")
	public abstract void method8342(@OriginalArg(1) Class100 arg0);

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(ILclient!ha;)Z")
	public abstract boolean method8343(@OriginalArg(1) Class100 arg0);

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "(I)Z")
	public abstract boolean method8344();

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z[Lclient!ih;II)I")
	protected final int method8346(@OriginalArg(1) Class5_Sub12[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static680.aLongArrayArrayArray1[this.aByte139][arg1][arg2];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			arg0[local18++] = Static665.aClass204Array3[local28 - 1].aClass5_Sub12_2;
			local16 += 16L;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg0[local28] = null;
		}
		if (false) {
			this.method8356();
		}
		return local18;
	}

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)I")
	public abstract int method8347();

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "([Lclient!ih;Z)I")
	public abstract int method8349(@OriginalArg(0) Class5_Sub12[] arg0);

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(Lclient!ha;B)Lclient!rga;")
	public abstract Class315 method8350(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)V")
	public abstract void method8351(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)Z")
	public abstract boolean method8352(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIILclient!ha;)Z")
	public abstract boolean method8353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class100 arg2);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZILclient!ha;ILclient!rda;II)V")
	public abstract void method8354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!ha;B)Lclient!kv;")
	public abstract Class4_Sub6 method8355(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "(B)Z")
	public abstract boolean method8356();

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)I")
	public int method8357() {
		return 0;
	}
}
