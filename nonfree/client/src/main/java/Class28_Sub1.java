import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public abstract class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!wea", name = "o", descriptor = "Z")
	public boolean aBoolean816;

	@OriginalMember(owner = "client!wea", name = "p", descriptor = "B")
	public byte aByte173;

	@OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
	public int anInt10721;

	@OriginalMember(owner = "client!wea", name = "r", descriptor = "I")
	public int anInt10722;

	@OriginalMember(owner = "client!wea", name = "v", descriptor = "B")
	public byte aByte174;

	@OriginalMember(owner = "client!wea", name = "w", descriptor = "I")
	public int anInt10725;

	@OriginalMember(owner = "client!wea", name = "x", descriptor = "Lclient!wea;")
	public Class28_Sub1 aClass28_Sub1_23;

	@OriginalMember(owner = "client!wea", name = "y", descriptor = "I")
	public int anInt10726;

	@OriginalMember(owner = "client!wea", name = "C", descriptor = "I")
	public int anInt10729;

	@OriginalMember(owner = "client!wea", name = "E", descriptor = "I")
	public int anInt10731;

	@OriginalMember(owner = "client!wea", name = "A", descriptor = "Z")
	public boolean aBoolean817 = false;

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V")
	protected Class28_Sub1() {
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I[Lclient!uca;IB)I")
	protected final int method9279(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15[] arg1, @OriginalArg(2) int arg2) {
		@Pc(14) long local14 = Static234.aLongArrayArrayArray1[this.aByte174][arg2][arg0];
		@Pc(21) long local21 = 0L;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		while (local21 <= 48L) {
			local33 = (int) (local14 >> (int) local21 & 0xFFFFL);
			if (local33 <= 0) {
				break;
			}
			arg1[local23++] = Static541.aClass265Array1[local33 - 1].aClass3_Sub15_2;
			local21 += 16L;
		}
		for (local33 = local23; local33 < 4; local33++) {
			arg1[local33] = null;
		}
		return local23;
	}

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "(I)Z")
	public abstract boolean method9280();

	@OriginalMember(owner = "client!wea", name = "h", descriptor = "(I)Z")
	public abstract boolean method9281();

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!ha;B)Lclient!el;")
	public abstract Class92 method9284(@OriginalArg(0) Class13 arg0);

	@OriginalMember(owner = "client!wea", name = "j", descriptor = "(I)V")
	public abstract void method9285();

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIILclient!ha;)Z")
	public abstract boolean method9286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2);

	@OriginalMember(owner = "client!wea", name = "k", descriptor = "(I)Z")
	public abstract boolean method9287();

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(BLclient!ha;)V")
	public abstract void method9288(@OriginalArg(1) Class13 arg0);

	@OriginalMember(owner = "client!wea", name = "l", descriptor = "(I)I")
	public abstract int method9289(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!ha;Lclient!wea;ZIIII)V")
	public abstract void method9290(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILclient!ha;)Lclient!dfa;")
	public abstract Class28_Sub3 method9291(@OriginalArg(1) Class13 arg0);

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(Z)I")
	public int method9294() {
		return 0;
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(ILclient!ha;)Z")
	public abstract boolean method9295(@OriginalArg(1) Class13 arg0);

	@OriginalMember(owner = "client!wea", name = "m", descriptor = "(I)I")
	public abstract int method9296();

	@OriginalMember(owner = "client!wea", name = "n", descriptor = "(I)Z")
	public abstract boolean method9297();

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B[Lclient!uca;)I")
	public abstract int method9298(@OriginalArg(1) Class3_Sub15[] arg0);
}
