import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "J")
	private long aLong141;

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
	public int anInt4904;

	@OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
	public int anInt4902 = 0;

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "Z")
	private boolean aBoolean309 = false;

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "Z")
	public boolean aBoolean310 = false;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "Lclient!bt;")
	private Class43 aClass43_8 = new Class43();

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "I")
	private int anInt4903 = 0;

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "Lclient!v;")
	public Class362 aClass362_21 = new Class362();

	@OriginalMember(owner = "client!ju", name = "z", descriptor = "I")
	private int anInt4905 = 0;

	@OriginalMember(owner = "client!ju", name = "C", descriptor = "Z")
	public boolean aBoolean312 = false;

	@OriginalMember(owner = "client!ju", name = "B", descriptor = "Z")
	private boolean aBoolean311 = false;

	@OriginalMember(owner = "client!ju", name = "A", descriptor = "Lclient!hda;")
	public final Class137 aClass137_1 = new Class137();

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "[Lclient!fja;")
	public final Class2_Sub6_Sub1_Sub1[] aClass2_Sub6_Sub1_Sub1Array2 = new Class2_Sub6_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(IZ)V")
	public Class2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4166(arg0, arg1);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!ha;[Lclient!fba;Z)V")
	private void method4165(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class100[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static290.aBooleanArray18[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class2_Sub3 local16 = (Class2_Sub3) this.aClass43_8.method1087(); local16 != null; local16 = (Class2_Sub3) this.aClass43_8.method1088()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass100_1 == arg1[local21] || local16.aClass100_1 == arg1[local21].aClass100_2) {
						Static290.aBooleanArray18[local21] = true;
						local16.method953();
						local16.aBoolean46 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt1002 == 0) {
				local16.method8436();
				this.anInt4903--;
			} else {
				local16.aBoolean46 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt4903 != 32; local21++) {
			if (!Static290.aBooleanArray18[local21]) {
				@Pc(104) Class2_Sub3 local104 = new Class2_Sub3(arg0, arg1[local21], this, this.aLong141);
				this.aClass43_8.method1084(local104);
				this.anInt4903++;
				Static290.aBooleanArray18[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)V")
	public void method4166(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static100.aClass43_4.method1084(this);
		this.aLong141 = (long) arg0;
		this.aLong142 = (long) arg0;
		this.aBoolean311 = true;
		this.aBoolean312 = arg1;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method4167(@OriginalArg(0) Class132 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong141 == this.aLong142) {
			this.method4177();
		} else {
			this.method4175();
		}
		if (arg1 - this.aLong141 > 750L) {
			this.method4178();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong142);
		@Pc(36) Class2_Sub3 local36;
		if (this.aBoolean311) {
			for (local36 = (Class2_Sub3) this.aClass43_8.method1087(); local36 != null; local36 = (Class2_Sub3) this.aClass43_8.method1088()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass117_1.anInt2923; local39++) {
					local36.method954(1, arg1, arg0, !this.aBoolean309);
				}
			}
			this.aBoolean311 = false;
		}
		for (local36 = (Class2_Sub3) this.aClass43_8.method1087(); local36 != null; local36 = (Class2_Sub3) this.aClass43_8.method1088()) {
			local36.method954(local27, arg1, arg0, !this.aBoolean309);
		}
		this.aLong142 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([Lclient!mb;Z)V")
	private void method4168(@OriginalArg(0) Class218[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static290.aBooleanArray19[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class6_Sub4_Sub3 local16 = (Class6_Sub4_Sub3) this.aClass362_21.method8538(); local16 != null; local16 = (Class6_Sub4_Sub3) this.aClass362_21.method8530()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass218_1 == arg0[local21] || local16.aClass218_1 == arg0[local21].aClass218_2) {
						Static290.aBooleanArray19[local21] = true;
						local16.method1246();
						continue label71;
					}
				}
			}
			local16.method9174();
			this.anInt4905--;
			if (local16.method9044()) {
				local16.method9043();
				Static466.anInt8062--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt4905 != 8; local21++) {
			if (!Static290.aBooleanArray19[local21]) {
				@Pc(96) Class6_Sub4_Sub3 local96 = null;
				if (arg0[local21].method5204().anInt2468 == 1 && Static466.anInt8062 < 32) {
					local96 = new Class6_Sub4_Sub3(arg0[local21], this);
					Static263.aClass263_1.method6425(local96, (long) arg0[local21].anInt6154);
					Static466.anInt8062++;
				}
				if (local96 == null) {
					local96 = new Class6_Sub4_Sub3(arg0[local21], this);
				}
				this.aClass362_21.method8536(local96);
				this.anInt4905++;
				Static290.aBooleanArray19[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!ha;J[Lclient!fba;[Lclient!mb;Z)V")
	public void method4169(@OriginalArg(0) Class132 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class100[] arg2, @OriginalArg(3) Class218[] arg3) {
		if (!this.aBoolean310) {
			this.method4165(arg0, arg2);
			this.method4168(arg3);
			this.aLong141 = arg1;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "()Lclient!hda;")
	public Class137 method4170() {
		return this.aClass137_1;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIII)V")
	public void method4171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4904 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "()Lclient!hda;")
	public Class137 method4172() {
		this.aClass137_1.aClass333_1.method7901();
		for (@Pc(6) int local6 = 0; local6 < this.aClass2_Sub6_Sub1_Sub1Array2.length; local6++) {
			if (this.aClass2_Sub6_Sub1_Sub1Array2[local6] != null && this.aClass2_Sub6_Sub1_Sub1Array2[local6].aClass2_Sub3_1 != null) {
				this.aClass137_1.aClass333_1.method7904(this.aClass2_Sub6_Sub1_Sub1Array2[local6]);
			}
		}
		return this.aClass137_1;
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "()V")
	public void method4173() {
		this.aBoolean311 = true;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(J)V")
	public void method4174(@OriginalArg(0) long arg0) {
		this.aLong141 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "()V")
	public void method4175() {
		this.aBoolean309 = true;
	}

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "()V")
	private void method4177() {
		this.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "()V")
	public void method4178() {
		this.aBoolean310 = true;
		for (@Pc(8) Class6_Sub4_Sub3 local8 = (Class6_Sub4_Sub3) this.aClass362_21.method8538(); local8 != null; local8 = (Class6_Sub4_Sub3) this.aClass362_21.method8530()) {
			if (local8.aClass99_1.anInt2468 == 1) {
				local8.method9043();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass2_Sub6_Sub1_Sub1Array2.length; local27++) {
			if (this.aClass2_Sub6_Sub1_Sub1Array2[local27] != null) {
				this.aClass2_Sub6_Sub1_Sub1Array2[local27].method2278();
				this.aClass2_Sub6_Sub1_Sub1Array2[local27] = null;
			}
		}
		this.anInt4902 = 0;
		this.aClass43_8 = new Class43();
		this.anInt4903 = 0;
		this.aClass362_21 = new Class362();
		this.anInt4905 = 0;
		this.method8436();
		Static591.aClass2_Sub8Array1[Static136.anInt2379] = this;
		Static136.anInt2379 = Static136.anInt2379 + 1 & Static376.anIntArray372[Static27.anInt7651];
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!ha;)V")
	public void method4179(@OriginalArg(0) Class132 arg0) {
		this.aClass137_1.aClass333_1.method7901();
		for (@Pc(10) Class2_Sub3 local10 = (Class2_Sub3) this.aClass43_8.method1087(); local10 != null; local10 = (Class2_Sub3) this.aClass43_8.method1088()) {
			local10.method957(this.aLong142, arg0);
		}
	}
}
