import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public abstract class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	public int anInt8758;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "B")
	public byte aByte111;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Z")
	public boolean aBoolean676;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
	public int anInt8759;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
	public int anInt8761;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
	public int anInt8762;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
	public int anInt8763;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
	public int anInt8764;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "B")
	public byte aByte112;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	protected Class6_Sub1() {
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([Lclient!gga;I)I")
	public abstract int method7315(@OriginalArg(0) Class2_Sub14[] arg0);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	public abstract Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0);

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "(B)Z")
	public abstract boolean method7318();

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)I")
	public abstract int method7319(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "(B)Z")
	public abstract boolean method7320();

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B[Lclient!gga;II)I")
	protected final int method7321(@OriginalArg(1) Class2_Sub14[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static501.aLongArrayArrayArray1[this.aByte112][arg1][arg2];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(31) int local31;
		while (local16 <= 48L) {
			local31 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local31 <= 0) {
				break;
			}
			arg0[local18++] = Static237.aClass265Array2[local31 - 1].aClass2_Sub14_3;
			local16 += 16L;
		}
		for (local31 = local18; local31 < 4; local31++) {
			arg0[local31] = null;
		}
		return local18;
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)V")
	public abstract void method7322();

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(ZLclient!r;)V")
	public abstract void method7323(@OriginalArg(1) Class100 arg0);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	public abstract void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	public abstract Class297 method7326(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)Z")
	public abstract boolean method7327();

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)I")
	public abstract int method7328();

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "(B)Z")
	public abstract boolean method7329();

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "(B)Z")
	public abstract boolean method7330();

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!r;I)Z")
	public abstract boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2);
}
