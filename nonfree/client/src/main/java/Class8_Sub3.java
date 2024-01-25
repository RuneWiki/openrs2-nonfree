import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public abstract class Class8_Sub3 extends Class8 {

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
	public int anInt9361;

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "B")
	public byte aByte123;

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "B")
	public byte aByte124;

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
	public int anInt9365;

	@OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
	public int anInt9366;

	@OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
	public int anInt9367;

	@OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
	public int anInt9368;

	@OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
	public int anInt9370;

	@OriginalMember(owner = "client!rga", name = "q", descriptor = "Z")
	public boolean aBoolean730;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "()V")
	protected Class8_Sub3() {
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I[Lclient!rc;)I")
	public abstract int method7616(@OriginalArg(1) Class1_Sub18[] arg0);

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "(I)V")
	public abstract void method7617();

	@OriginalMember(owner = "client!rga", name = "g", descriptor = "(I)I")
	public abstract int method7618();

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I[Lclient!rc;II)I")
	protected final int method7619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) long local14 = Static91.aLongArrayArrayArray1[this.aByte123][arg0][arg2];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(28) int local28;
		while (local16 <= 48L) {
			local28 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local28 <= 0) {
				break;
			}
			arg1[local18++] = Static172.aClass79Array1[local28 - 1].aClass1_Sub18_2;
			local16 += 16L;
		}
		for (local28 = local18; local28 < 4; local28++) {
			arg1[local28] = null;
		}
		return local18;
	}

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "(I)Z")
	public abstract boolean method7620();

	@OriginalMember(owner = "client!rga", name = "i", descriptor = "(I)Z")
	public abstract boolean method7622();

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	public abstract void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(Z)Z")
	public abstract boolean method7624();

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILclient!r;)V")
	public abstract void method7625(@OriginalArg(1) Class134 arg0);

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IILclient!r;I)Z")
	public abstract boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	public abstract Class242 method7627(@OriginalArg(1) Class134 arg0);

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)I")
	public abstract int method7628(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "(I)Z")
	public abstract boolean method7629();

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	public abstract Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0);

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "(I)Z")
	public abstract boolean method7631();
}
