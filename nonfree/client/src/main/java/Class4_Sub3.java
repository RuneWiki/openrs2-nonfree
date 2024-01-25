import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public abstract class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!haa", name = "q", descriptor = "I")
	public int anInt11177;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
	public int anInt11178;

	@OriginalMember(owner = "client!haa", name = "o", descriptor = "I")
	public int anInt11179;

	@OriginalMember(owner = "client!haa", name = "p", descriptor = "I")
	public int anInt11180;

	@OriginalMember(owner = "client!haa", name = "t", descriptor = "I")
	public int anInt11182;

	@OriginalMember(owner = "client!haa", name = "u", descriptor = "B")
	public byte aByte146;

	@OriginalMember(owner = "client!haa", name = "w", descriptor = "Lclient!haa;")
	public Class4_Sub3 aClass4_Sub3_25;

	@OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
	public int anInt11184;

	@OriginalMember(owner = "client!haa", name = "r", descriptor = "B")
	public byte aByte147;

	@OriginalMember(owner = "client!haa", name = "s", descriptor = "Z")
	public boolean aBoolean778;

	@OriginalMember(owner = "client!haa", name = "k", descriptor = "Z")
	public boolean aBoolean779 = false;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	protected Class4_Sub3() {
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(B)Z")
	public abstract boolean method9476();

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "(I)I")
	public int method9477() {
		return 0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZILclient!ha;)Z")
	public abstract boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2);

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "(I)I")
	public abstract int method9479();

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	public abstract void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!haa", name = "k", descriptor = "(I)V")
	public abstract void method9482();

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "(I)Z")
	public abstract boolean method9483();

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([Lclient!rfa;BII)I")
	protected final int method9484(@OriginalArg(0) Class14_Sub18[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static378.aLongArrayArrayArray1[this.aByte146][arg2][arg1];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(30) int local30;
		while (local16 <= 48L) {
			local30 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local30 <= 0) {
				break;
			}
			arg0[local18++] = Static351.aClass275Array5[local30 - 1].aClass14_Sub18_2;
			local16 += 16L;
		}
		if (55 == 55) {
			for (local30 = local18; local30 < 4; local30++) {
				arg0[local30] = null;
			}
			return local18;
		} else {
			return 43;
		}
	}

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "(I)I")
	public abstract int method9485(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "(I)Z")
	public abstract boolean method9486();

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ha;B)Z")
	public abstract boolean method9487(@OriginalArg(0) Class144 arg0);

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([Lclient!rfa;B)I")
	public abstract int method9488(@OriginalArg(0) Class14_Sub18[] arg0);

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "(I)Z")
	public abstract boolean method9489();

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ha;Z)V")
	public abstract void method9490(@OriginalArg(0) Class144 arg0);

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	public abstract Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0);

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	public abstract Class348 method9492(@OriginalArg(0) Class144 arg0);
}
