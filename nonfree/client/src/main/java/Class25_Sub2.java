import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public abstract class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "B")
	public byte aByte117;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
	public int anInt8476;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "Z")
	public boolean aBoolean575;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
	public int anInt8478;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
	public int anInt8479;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
	public int anInt8480;

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "B")
	public byte aByte118;

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
	public int anInt8481;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
	public int anInt8482;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	protected Class25_Sub2() {
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)Z")
	public abstract boolean method6643();

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "(B)V")
	public abstract void method6644();

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(I)Z")
	public abstract boolean method6646();

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(ILclient!r;)Lclient!od;")
	public abstract Class25_Sub10 method6647(@OriginalArg(1) Class31 arg0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLclient!r;)Lclient!ll;")
	public abstract Class190 method6648(@OriginalArg(1) Class31 arg0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([Lclient!cp;BII)I")
	protected final int method6649(@OriginalArg(0) Class3_Sub9[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static31.aLongArrayArrayArray1[this.aByte117][arg2][arg1];
		@Pc(21) long local21 = 0L;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		while (local21 <= 48L) {
			local33 = (int) (local14 >> (int) local21 & 0xFFFFL);
			if (local33 <= 0) {
				break;
			}
			arg0[local23++] = Static196.aClass235Array1[local33 - 1].aClass3_Sub9_2;
			local21 += 16L;
		}
		for (local33 = local23; local33 < 4; local33++) {
			arg0[local33] = null;
		}
		return local23;
	}

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "(B)I")
	public abstract int method6650(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "(I)Z")
	public abstract boolean method6651();

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "(I)I")
	public abstract int method6652();

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "(I)Z")
	public abstract boolean method6653();

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIILclient!r;ZILclient!pn;)V")
	public abstract void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class25_Sub2 arg5);

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "(I)Z")
	public abstract boolean method6655();

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!r;Z)V")
	public abstract void method6656(@OriginalArg(0) Class31 arg0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZILclient!r;I)Z")
	public abstract boolean method6657(@OriginalArg(1) int arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B[Lclient!cp;)I")
	public abstract int method6658(@OriginalArg(1) Class3_Sub9[] arg0);
}
