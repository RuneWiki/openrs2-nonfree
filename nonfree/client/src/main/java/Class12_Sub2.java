import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public abstract class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
	public int anInt9373;

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
	public int anInt9374;

	@OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
	public int anInt9375;

	@OriginalMember(owner = "client!caa", name = "k", descriptor = "Z")
	public boolean aBoolean781;

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
	public int anInt9377;

	@OriginalMember(owner = "client!caa", name = "o", descriptor = "I")
	public int anInt9378;

	@OriginalMember(owner = "client!caa", name = "r", descriptor = "B")
	public byte aByte128;

	@OriginalMember(owner = "client!caa", name = "s", descriptor = "I")
	public int anInt9381;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V")
	protected Class12_Sub2() {
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!r;I)Lclient!hr;")
	public abstract Class12_Sub3 method7496(@OriginalArg(0) Class162 arg0);

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(Lclient!r;I)V")
	public abstract void method7498(@OriginalArg(0) Class162 arg0);

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "(I)Z")
	public abstract boolean method7499();

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIZLclient!r;)Z")
	public abstract boolean method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class162 arg2);

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(Z)I")
	public abstract int method7501();

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(Lclient!r;I)Lclient!ifa;")
	public abstract Class157 method7502(@OriginalArg(0) Class162 arg0);

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "(I)Z")
	public abstract boolean method7503();

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I[Lclient!tg;)I")
	public abstract int method7505(@OriginalArg(1) Class2_Sub11[] arg0);

	@OriginalMember(owner = "client!caa", name = "c", descriptor = "(Z)Z")
	public abstract boolean method7506();

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILclient!r;ILclient!caa;ZII)V")
	public abstract void method7507(@OriginalArg(0) int arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIB[Lclient!tg;)I")
	protected final int method7508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub11[] arg2) {
		@Pc(21) long local21 = Static94.aLongArrayArrayArray1[this.aByte128][arg0][arg1];
		@Pc(23) long local23 = 0L;
		@Pc(25) int local25 = 0;
		@Pc(35) int local35;
		while (local23 <= 48L) {
			local35 = (int) (local21 >> (int) local23 & 0xFFFFL);
			if (local35 <= 0) {
				break;
			}
			local23 += 16L;
			arg2[local25++] = Static375.aClass141Array1[local35 - 1].aClass2_Sub11_1;
		}
		for (local35 = local25; local35 < 4; local35++) {
			arg2[local35] = null;
		}
		return local25;
	}

	@OriginalMember(owner = "client!caa", name = "f", descriptor = "(I)I")
	public abstract int method7509(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "(Z)Z")
	public abstract boolean method7510();

	@OriginalMember(owner = "client!caa", name = "d", descriptor = "(B)V")
	public abstract void method7511();

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "(I)Z")
	public abstract boolean method7513();
}
