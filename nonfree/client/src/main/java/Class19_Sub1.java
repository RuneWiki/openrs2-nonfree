import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bla")
public abstract class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!bla", name = "g", descriptor = "Z")
	public boolean aBoolean808;

	@OriginalMember(owner = "client!bla", name = "i", descriptor = "I")
	public int anInt11204;

	@OriginalMember(owner = "client!bla", name = "m", descriptor = "I")
	public int anInt11205;

	@OriginalMember(owner = "client!bla", name = "h", descriptor = "B")
	public byte aByte145;

	@OriginalMember(owner = "client!bla", name = "p", descriptor = "B")
	public byte aByte146;

	@OriginalMember(owner = "client!bla", name = "o", descriptor = "I")
	public int anInt11207;

	@OriginalMember(owner = "client!bla", name = "e", descriptor = "I")
	public int anInt11208;

	@OriginalMember(owner = "client!bla", name = "r", descriptor = "I")
	public int anInt11210;

	@OriginalMember(owner = "client!bla", name = "q", descriptor = "I")
	public int anInt11211;

	@OriginalMember(owner = "client!bla", name = "d", descriptor = "Lclient!bla;")
	public Class19_Sub1 aClass19_Sub1_25;

	@OriginalMember(owner = "client!bla", name = "j", descriptor = "Z")
	public boolean aBoolean809 = false;

	@OriginalMember(owner = "client!bla", name = "<init>", descriptor = "()V")
	protected Class19_Sub1() {
	}

	@OriginalMember(owner = "client!bla", name = "c", descriptor = "(I)Z")
	public abstract boolean method9360();

	@OriginalMember(owner = "client!bla", name = "e", descriptor = "(I)I")
	public abstract int method9361(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bla", name = "d", descriptor = "(I)I")
	public int method9362() {
		return 0;
	}

	@OriginalMember(owner = "client!bla", name = "e", descriptor = "(B)I")
	public abstract int method9364();

	@OriginalMember(owner = "client!bla", name = "f", descriptor = "(I)Z")
	public abstract boolean method9365();

	@OriginalMember(owner = "client!bla", name = "h", descriptor = "(I)Z")
	public abstract boolean method9366();

	@OriginalMember(owner = "client!bla", name = "f", descriptor = "(B)V")
	public abstract void method9367();

	@OriginalMember(owner = "client!bla", name = "g", descriptor = "(I)Z")
	public abstract boolean method9368();

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "(BILclient!ha;I)Z")
	public abstract boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "(ZLclient!ha;)Z")
	public abstract boolean method9370(@OriginalArg(1) Class67 arg0);

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	public abstract Class68 method9371(@OriginalArg(0) Class67 arg0);

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	public abstract void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "(Lclient!ha;Z)V")
	public abstract void method9374(@OriginalArg(0) Class67 arg0);

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "(I[Lclient!vj;II)I")
	protected final int method9375(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub16[] arg1, @OriginalArg(2) int arg2) {
		@Pc(14) long local14 = Static353.aLongArrayArrayArray1[this.aByte146][arg0][arg2];
		@Pc(16) long local16 = 0L;
		@Pc(18) int local18 = 0;
		@Pc(37) int local37;
		while (local16 <= 48L) {
			local37 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local37 <= 0) {
				break;
			}
			local16 += 16L;
			arg1[local18++] = Static458.aClass246Array1[local37 - 1].aClass3_Sub16_3;
		}
		for (local37 = local18; local37 < 4; local37++) {
			arg1[local37] = null;
		}
		return local18;
	}

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "([Lclient!vj;B)I")
	public abstract int method9376(@OriginalArg(0) Class3_Sub16[] arg0);

	@OriginalMember(owner = "client!bla", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	public abstract Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0);
}
