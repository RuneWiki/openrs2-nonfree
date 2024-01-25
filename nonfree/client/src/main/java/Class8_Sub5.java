import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class8_Sub5 extends Class8 {

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public int anInt4194;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public int anInt4195;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
	public int anInt4196;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
	public int anInt4197;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public int anInt4192 = 0;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!fi;")
	private Class65 aClass65_6 = new Class65();

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
	private int anInt4193 = 0;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "Lclient!m;")
	public Class127 aClass127_21 = new Class127();

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	private int anInt4198 = 0;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!ai;")
	public final Class9 aClass9_2 = new Class9();

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "[Lclient!hm;")
	public Class8_Sub4_Sub1_Sub1[] aClass8_Sub4_Sub1_Sub1Array1 = new Class8_Sub4_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "J")
	private long aLong139;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V")
	public Class8_Sub5(@OriginalArg(0) int arg0) {
		Static223.aClass65_7.method1458(this);
		this.aLong138 = arg0;
		this.aLong139 = arg0;
		this.aBoolean241 = true;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
	public void method3569() {
		this.aBoolean240 = true;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "()Lclient!ai;")
	public Class9 method3570() {
		return this.aClass9_2;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIII)V")
	public void method3571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4195 = arg0;
		this.anInt4194 = arg1;
		this.anInt4197 = arg3;
		this.anInt4196 = arg4;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "()V")
	private void method3572() {
		this.aBoolean240 = false;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "()V")
	public void method3573() {
		this.aBoolean241 = true;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!tj;J[Lclient!jq;[Lclient!ti;Z)V")
	public void method3574(@OriginalArg(0) Class122 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class112[] arg2, @OriginalArg(3) Class191[] arg3) {
		if (!this.aBoolean239) {
			this.method3575(arg0, arg2);
			this.method3581(arg3);
			this.aLong138 = arg1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!tj;[Lclient!jq;Z)V")
	private void method3575(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class112[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static206.aBooleanArray20[local1] = false;
		}
		@Pc(21) int local21;
		label59: for (@Pc(16) Class8_Sub1 local16 = (Class8_Sub1) this.aClass65_6.method1462(); local16 != null; local16 = (Class8_Sub1) this.aClass65_6.method1461()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass112_1 == arg1[local21] || local16.aClass112_1 == arg1[local21].aClass112_2) {
						Static206.aBooleanArray20[local21] = true;
						local16.method163();
						local16.aBoolean18 = false;
						continue label59;
					}
				}
			}
			if (local16.anInt229 == 0) {
				local16.method4645();
				this.anInt4193--;
			} else {
				local16.aBoolean18 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && this.anInt4193 != 8; local21++) {
			if (!Static206.aBooleanArray20[local21]) {
				@Pc(101) Class8_Sub1 local101 = new Class8_Sub1(arg0, arg1[local21], this, this.aLong138);
				this.aClass65_6.method1458(local101);
				this.anInt4193++;
				Static206.aBooleanArray20[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "()V")
	public void method3577() {
		this.aBoolean239 = true;
		for (@Pc(8) Class3_Sub7_Sub5 local8 = (Class3_Sub7_Sub5) this.aClass127_21.method3402(); local8 != null; local8 = (Class3_Sub7_Sub5) this.aClass127_21.method3400()) {
			if (local8.aClass196_1.anInt6167 == 1) {
				local8.method5385();
			}
		}
		this.aClass8_Sub4_Sub1_Sub1Array1 = new Class8_Sub4_Sub1_Sub1[8192];
		this.anInt4192 = 0;
		this.aClass65_6 = new Class65();
		this.anInt4193 = 0;
		this.aClass127_21 = new Class127();
		this.anInt4198 = 0;
		this.method4645();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!tj;J)Z")
	public boolean method3578(@OriginalArg(0) Class122 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong138 == this.aLong139) {
			this.method3572();
		} else {
			this.method3569();
		}
		if (arg1 - this.aLong138 > 750L) {
			this.method3577();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong139);
		@Pc(36) Class8_Sub1 local36;
		if (this.aBoolean241) {
			for (local36 = (Class8_Sub1) this.aClass65_6.method1462(); local36 != null; local36 = (Class8_Sub1) this.aClass65_6.method1461()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass145_1.anInt4375; local39++) {
					local36.method164(!this.aBoolean240, arg1, 1, arg0);
				}
			}
			this.aBoolean241 = false;
		}
		for (local36 = (Class8_Sub1) this.aClass65_6.method1462(); local36 != null; local36 = (Class8_Sub1) this.aClass65_6.method1461()) {
			local36.method164(!this.aBoolean240, arg1, local27, arg0);
		}
		this.aLong139 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "()V")
	public void method3579() {
		this.aClass9_2.aClass76_1.method1878();
		for (@Pc(10) Class8_Sub1 local10 = (Class8_Sub1) this.aClass65_6.method1462(); local10 != null; local10 = (Class8_Sub1) this.aClass65_6.method1461()) {
			local10.method161(this.aLong139);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(J)V")
	public void method3580(@OriginalArg(0) long arg0) {
		this.aLong138 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([Lclient!ti;Z)V")
	private void method3581(@OriginalArg(0) Class191[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static206.aBooleanArray21[local1] = false;
		}
		@Pc(21) int local21;
		label68: for (@Pc(16) Class3_Sub7_Sub5 local16 = (Class3_Sub7_Sub5) this.aClass127_21.method3402(); local16 != null; local16 = (Class3_Sub7_Sub5) this.aClass127_21.method3400()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass191_1 == arg0[local21] || local16.aClass191_1 == arg0[local21].aClass191_2) {
						Static206.aBooleanArray21[local21] = true;
						local16.method1086();
						continue label68;
					}
				}
			}
			local16.method5717();
			this.anInt4198--;
			if (local16.method5388()) {
				local16.method5385();
				Static60.anInt1277--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && this.anInt4198 != 8; local21++) {
			if (!Static206.aBooleanArray21[local21]) {
				@Pc(93) Class3_Sub7_Sub5 local93 = null;
				if (Static152.method2446(arg0[local21].anInt5988).anInt6167 == 1 && Static60.anInt1277 < 32) {
					local93 = new Class3_Sub7_Sub5(arg0[local21], this);
					Static177.aClass162_1.method4158(local93, (long) arg0[local21].anInt5988);
					Static60.anInt1277++;
				}
				if (local93 == null) {
					local93 = new Class3_Sub7_Sub5(arg0[local21], this);
				}
				this.aClass127_21.method3387(local93);
				this.anInt4198++;
				Static206.aBooleanArray21[local21] = true;
			}
		}
	}
}
