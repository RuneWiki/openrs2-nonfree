import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "B")
	public byte aByte128;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public int anInt10421;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	public int anInt10422;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	public int anInt10423;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	public int anInt10424;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Z")
	public boolean aBoolean873;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public int anInt10428;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public int anInt10429;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "B")
	public byte aByte129;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!mb;")
	public Class2_Sub3 aClass2_Sub3_23;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Z")
	public boolean aBoolean872 = false;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	protected Class2_Sub3() {
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public abstract void method8563();

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Z")
	public abstract boolean method8564();

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZLclient!ha;)V")
	public abstract void method8565(@OriginalArg(1) Class33 arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	public abstract Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(ILclient!ha;)Z")
	public abstract boolean method8567(@OriginalArg(1) Class33 arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ[Lclient!pk;)I")
	protected final int method8568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub27[] arg2) {
		@Pc(14) long local14 = Static408.aLongArrayArrayArray1[this.aByte128][arg0][arg1];
		@Pc(16) long local16 = 0L;
		@Pc(24) int local24 = 0;
		@Pc(34) int local34;
		while (local16 <= 48L) {
			local34 = (int) (local14 >> (int) local16 & 0xFFFFL);
			if (local34 <= 0) {
				break;
			}
			arg2[local24++] = Static523.aClass93Array1[local34 - 1].aClass3_Sub27_2;
			local16 += 16L;
		}
		for (local34 = local24; local34 < 4; local34++) {
			arg2[local34] = null;
		}
		return local24;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	public abstract void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)Z")
	public abstract boolean method8570();

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	public abstract Class332 method8572(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBLclient!ha;)Z")
	public abstract boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2);

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)I")
	public abstract int method8574();

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)I")
	public abstract int method8575(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[Lclient!pk;)I")
	public abstract int method8577(@OriginalArg(1) Class3_Sub27[] arg0);

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)I")
	public int method8578() {
		return 0;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(B)Z")
	public abstract boolean method8579();

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "(I)Z")
	public abstract boolean method8580();
}
