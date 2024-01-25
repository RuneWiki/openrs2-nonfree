import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public abstract class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public int anInt9313;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public int anInt9315;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public int anInt9317;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
	public int anInt9319;

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "B")
	public byte aByte125;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
	public int anInt9320;

	@OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
	public int anInt9321;

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Z")
	public boolean aBoolean760;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!kf;")
	public Class14_Sub1 aClass14_Sub1_22;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "B")
	public byte aByte126;

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Z")
	public boolean aBoolean759 = false;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	protected Class14_Sub1() {
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)Z")
	public abstract boolean method7987();

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([Lclient!tn;B)I")
	public abstract int method7990(@OriginalArg(0) Class5_Sub27[] arg0);

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)I")
	public abstract int method7991(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Z")
	public abstract boolean method7992();

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)Z")
	public abstract boolean method7993();

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)I")
	public int method7994() {
		return 0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	public abstract void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ha;B)V")
	public abstract void method7997(@OriginalArg(0) Class126 arg0);

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(B)Z")
	public abstract boolean method7998();

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	public abstract Class55 method7999(@OriginalArg(1) Class126 arg0);

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lclient!ha;B)Z")
	public abstract boolean method8000(@OriginalArg(0) Class126 arg0);

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
	public abstract void method8001();

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	public abstract Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	public abstract boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "(I)I")
	public abstract int method8004();

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([Lclient!tn;IBI)I")
	protected final int method8005(@OriginalArg(0) Class5_Sub27[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static484.aLongArrayArrayArray1[this.aByte125][arg1][arg2];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			arg0[local18++] = Static580.aClass175Array12[local28 - 1].aClass5_Sub27_2;
			local16 += 16L;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg0[local28] = null;
		}
		return local18;
	}
}
