import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class98_Sub3 extends Class98 {

	@OriginalMember(owner = "client!l", name = "j", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!l", name = "n", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!l", name = "r", descriptor = "I")
	public int anInt5243;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "I")
	public int anInt5245;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "I")
	public int anInt5246;

	@OriginalMember(owner = "client!l", name = "x", descriptor = "I")
	public int anInt5247;

	@OriginalMember(owner = "client!l", name = "y", descriptor = "I")
	public int anInt5248;

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Z")
	private boolean aBoolean370 = false;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "I")
	public int anInt5241 = 0;

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!ca;")
	private Class40 aClass40_4 = new Class40();

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	private int anInt5242 = 0;

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!ws;")
	public Class361 aClass361_43 = new Class361();

	@OriginalMember(owner = "client!l", name = "s", descriptor = "I")
	private int anInt5244 = 0;

	@OriginalMember(owner = "client!l", name = "q", descriptor = "Z")
	public boolean aBoolean371 = false;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "Z")
	private boolean aBoolean372 = false;

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!ig;")
	public final Class144 aClass144_1 = new Class144();

	@OriginalMember(owner = "client!l", name = "l", descriptor = "[Lclient!wh;")
	public final Class98_Sub1_Sub1_Sub1[] aClass98_Sub1_Sub1_Sub1Array1 = new Class98_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IZ)V")
	public Class98_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4542(arg0, arg1);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!oa;)V")
	public void method4527(@OriginalArg(0) Class14 arg0) {
		this.aClass144_1.aClass254_1.method5863();
		for (@Pc(10) Class98_Sub7 local10 = (Class98_Sub7) this.aClass40_4.method1132(); local10 != null; local10 = (Class98_Sub7) this.aClass40_4.method1129()) {
			local10.method7322(this.aLong145, arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
	private void method4529() {
		this.aBoolean370 = false;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
	public void method4530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5248 = arg0;
		this.anInt5245 = arg1;
		this.anInt5246 = arg2;
		this.anInt5247 = arg3;
		this.anInt5243 = arg4;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()Lclient!ig;")
	public Class144 method4532() {
		return this.aClass144_1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!oa;J)Z")
	public boolean method4533(@OriginalArg(0) Class14 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong146 == this.aLong145) {
			this.method4529();
		} else {
			this.method4537();
		}
		if (arg1 - this.aLong146 > 750L) {
			this.method4539();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong145);
		@Pc(36) Class98_Sub7 local36;
		if (this.aBoolean372) {
			for (local36 = (Class98_Sub7) this.aClass40_4.method1132(); local36 != null; local36 = (Class98_Sub7) this.aClass40_4.method1129()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass281_1.anInt7673; local39++) {
					local36.method7323(arg0, 1, !this.aBoolean370, arg1);
				}
			}
			this.aBoolean372 = false;
		}
		for (local36 = (Class98_Sub7) this.aClass40_4.method1132(); local36 != null; local36 = (Class98_Sub7) this.aClass40_4.method1129()) {
			local36.method7323(arg0, local27, !this.aBoolean370, arg1);
		}
		this.aLong145 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(J)V")
	public void method4534(@OriginalArg(0) long arg0) {
		this.aLong146 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!oa;[Lclient!et;Z)V")
	private void method4535(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class85[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static275.aBooleanArray24[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class98_Sub7 local16 = (Class98_Sub7) this.aClass40_4.method1132(); local16 != null; local16 = (Class98_Sub7) this.aClass40_4.method1129()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass85_2 == arg1[local21] || local16.aClass85_2 == arg1[local21].aClass85_1) {
						Static275.aBooleanArray24[local21] = true;
						local16.method7324();
						local16.aBoolean651 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt8913 == 0) {
				local16.method7855();
				this.anInt5242--;
			} else {
				local16.aBoolean651 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt5242 != 32; local21++) {
			if (!Static275.aBooleanArray24[local21]) {
				@Pc(104) Class98_Sub7 local104 = new Class98_Sub7(arg0, arg1[local21], this, this.aLong146);
				this.aClass40_4.method1131(local104);
				this.anInt5242++;
				Static275.aBooleanArray24[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Lclient!fd;Z)V")
	private void method4536(@OriginalArg(0) Class90[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static275.aBooleanArray23[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class6_Sub2_Sub11 local16 = (Class6_Sub2_Sub11) this.aClass361_43.method7838(); local16 != null; local16 = (Class6_Sub2_Sub11) this.aClass361_43.method7845()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass90_2 == arg0[local21] || local16.aClass90_2 == arg0[local21].aClass90_1) {
						Static275.aBooleanArray23[local21] = true;
						local16.method4110();
						continue label71;
					}
				}
			}
			local16.method7804();
			this.anInt5244--;
			if (local16.method7403()) {
				local16.method7405();
				Static202.anInt4160--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt5244 != 8; local21++) {
			if (!Static275.aBooleanArray23[local21]) {
				@Pc(96) Class6_Sub2_Sub11 local96 = null;
				if (arg0[local21].method2598().anInt1164 == 1 && Static202.anInt4160 < 32) {
					local96 = new Class6_Sub2_Sub11(arg0[local21], this);
					Static192.aClass223_1.method5320(local96, (long) arg0[local21].anInt2972);
					Static202.anInt4160++;
				}
				if (local96 == null) {
					local96 = new Class6_Sub2_Sub11(arg0[local21], this);
				}
				this.aClass361_43.method7833(local96);
				this.anInt5244++;
				Static275.aBooleanArray23[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "()V")
	public void method4537() {
		this.aBoolean370 = true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!oa;J[Lclient!et;[Lclient!fd;Z)V")
	public void method4538(@OriginalArg(0) Class14 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class85[] arg2, @OriginalArg(3) Class90[] arg3) {
		if (!this.aBoolean369) {
			this.method4535(arg0, arg2);
			this.method4536(arg3);
			this.aLong146 = arg1;
		}
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "()V")
	public void method4539() {
		this.aBoolean369 = true;
		for (@Pc(8) Class6_Sub2_Sub11 local8 = (Class6_Sub2_Sub11) this.aClass361_43.method7838(); local8 != null; local8 = (Class6_Sub2_Sub11) this.aClass361_43.method7845()) {
			if (local8.aClass42_1.anInt1164 == 1) {
				local8.method7405();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass98_Sub1_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass98_Sub1_Sub1_Sub1Array1[local27] != null) {
				this.aClass98_Sub1_Sub1_Sub1Array1[local27].method7774();
				this.aClass98_Sub1_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt5241 = 0;
		this.aClass40_4 = new Class40();
		this.anInt5242 = 0;
		this.aClass361_43 = new Class361();
		this.anInt5244 = 0;
		this.method7855();
		Static181.aClass98_Sub3Array1[Static178.anInt3720] = this;
		Static178.anInt3720 = Static178.anInt3720 + 1 & Static545.anIntArray691[Static92.anInt1780];
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "()V")
	public void method4540() {
		this.aBoolean372 = true;
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "()Lclient!ig;")
	public Class144 method4541() {
		this.aClass144_1.aClass254_1.method5863();
		for (@Pc(6) int local6 = 0; local6 < this.aClass98_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass98_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass98_Sub1_Sub1_Sub1Array1[local6].aClass98_Sub7_1 != null) {
				this.aClass144_1.aClass254_1.method5860(this.aClass98_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass144_1;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IZ)V")
	public void method4542(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static439.aClass40_6.method1131(this);
		this.aLong146 = arg0;
		this.aLong145 = arg0;
		this.aBoolean372 = true;
		this.aBoolean371 = arg1;
	}
}
