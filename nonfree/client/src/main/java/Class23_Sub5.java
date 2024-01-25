import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class23_Sub5 extends Class23 {

	@OriginalMember(owner = "client!f", name = "g", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "I")
	public int anInt2820;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
	private boolean aBoolean224 = false;

	@OriginalMember(owner = "client!f", name = "l", descriptor = "I")
	public int anInt2818 = 0;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "Z")
	public boolean aBoolean225 = false;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!em;")
	private Class105 aClass105_5 = new Class105();

	@OriginalMember(owner = "client!f", name = "p", descriptor = "I")
	private int anInt2819 = 0;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Lclient!jia;")
	public Class193 aClass193_16 = new Class193();

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "I")
	private int anInt2821 = 0;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Z")
	public boolean aBoolean227 = false;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!mf;")
	public final Class237 aClass237_1 = new Class237();

	@OriginalMember(owner = "client!f", name = "j", descriptor = "[Lclient!pha;")
	public final Class23_Sub1_Sub2_Sub1[] aClass23_Sub1_Sub2_Sub1Array1 = new Class23_Sub1_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IZ)V")
	public Class23_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2584(arg0, arg1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
	public void method2579() {
		this.aBoolean224 = true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([Lclient!qr;Z)V")
	private void method2580(@OriginalArg(0) Class298[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static150.aBooleanArray12[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class3_Sub6_Sub18 local16 = (Class3_Sub6_Sub18) this.aClass193_16.method4457(); local16 != null; local16 = (Class3_Sub6_Sub18) this.aClass193_16.method4459()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass298_2 == arg0[local21] || local16.aClass298_2 == arg0[local21].aClass298_1) {
						Static150.aBooleanArray12[local21] = true;
						local16.method7191();
						continue label71;
					}
				}
			}
			local16.method8770();
			this.anInt2821--;
			if (local16.method8339()) {
				local16.method8342();
				Static376.anInt6647--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt2821 != 8; local21++) {
			if (!Static150.aBooleanArray12[local21]) {
				@Pc(96) Class3_Sub6_Sub18 local96 = null;
				if (arg0[local21].method7100().anInt7613 == 1 && Static376.anInt6647 < 32) {
					local96 = new Class3_Sub6_Sub18(arg0[local21], this);
					Static636.aClass299_1.method7103(local96, (long) arg0[local21].anInt8372);
					Static376.anInt6647++;
				}
				if (local96 == null) {
					local96 = new Class3_Sub6_Sub18(arg0[local21], this);
				}
				this.aClass193_16.method4462(local96);
				this.anInt2821++;
				Static150.aBooleanArray12[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ha;[Lclient!oea;Z)V")
	private void method2581(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class261[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static150.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class23_Sub3 local16 = (Class23_Sub3) this.aClass105_5.method2444(); local16 != null; local16 = (Class23_Sub3) this.aClass105_5.method2448()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass261_1 == arg1[local21] || local16.aClass261_1 == arg1[local21].aClass261_2) {
						Static150.aBooleanArray13[local21] = true;
						local16.method1576();
						local16.aBoolean148 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt1636 == 0) {
				local16.method8588();
				this.anInt2819--;
			} else {
				local16.aBoolean148 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt2819 != 32; local21++) {
			if (!Static150.aBooleanArray13[local21]) {
				@Pc(104) Class23_Sub3 local104 = new Class23_Sub3(arg0, arg1[local21], this, this.aLong78);
				this.aClass105_5.method2447(local104);
				this.anInt2819++;
				Static150.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ha;)V")
	public void method2582(@OriginalArg(0) Class16 arg0) {
		this.aClass237_1.aClass125_1.method2784();
		for (@Pc(10) Class23_Sub3 local10 = (Class23_Sub3) this.aClass105_5.method2444(); local10 != null; local10 = (Class23_Sub3) this.aClass105_5.method2448()) {
			local10.method1578(this.aLong77, arg0);
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(IZ)V")
	public void method2584(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static663.aClass105_12.method2447(this);
		this.aLong78 = (long) arg0;
		this.aLong77 = (long) arg0;
		this.aBoolean226 = true;
		this.aBoolean227 = arg1;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method2586(@OriginalArg(0) Class16 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong78 == this.aLong77) {
			this.method2590();
		} else {
			this.method2579();
		}
		if (arg1 - this.aLong78 > 750L) {
			this.method2594();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong77);
		@Pc(36) Class23_Sub3 local36;
		if (this.aBoolean226) {
			for (local36 = (Class23_Sub3) this.aClass105_5.method2444(); local36 != null; local36 = (Class23_Sub3) this.aClass105_5.method2448()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass174_1.anInt4613; local39++) {
					local36.method1574(!this.aBoolean224, 1, arg1, arg0);
				}
			}
			this.aBoolean226 = false;
		}
		for (local36 = (Class23_Sub3) this.aClass105_5.method2444(); local36 != null; local36 = (Class23_Sub3) this.aClass105_5.method2448()) {
			local36.method1574(!this.aBoolean224, local27, arg1, arg0);
		}
		this.aLong77 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()Lclient!mf;")
	public Class237 method2587() {
		return this.aClass237_1;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()V")
	public void method2588() {
		this.aBoolean226 = true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(J)V")
	public void method2589(@OriginalArg(0) long arg0) {
		this.aLong78 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "()V")
	private void method2590() {
		this.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)V")
	public void method2591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2820 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "()Lclient!mf;")
	public Class237 method2592() {
		this.aClass237_1.aClass125_1.method2784();
		for (@Pc(6) int local6 = 0; local6 < this.aClass23_Sub1_Sub2_Sub1Array1.length; local6++) {
			if (this.aClass23_Sub1_Sub2_Sub1Array1[local6] != null && this.aClass23_Sub1_Sub2_Sub1Array1[local6].aClass23_Sub3_1 != null) {
				this.aClass237_1.aClass125_1.method2786(this.aClass23_Sub1_Sub2_Sub1Array1[local6]);
			}
		}
		return this.aClass237_1;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ha;J[Lclient!oea;[Lclient!qr;Z)V")
	public void method2593(@OriginalArg(0) Class16 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class261[] arg2, @OriginalArg(3) Class298[] arg3) {
		if (!this.aBoolean225) {
			this.method2581(arg0, arg2);
			this.method2580(arg3);
			this.aLong78 = arg1;
		}
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "()V")
	public void method2594() {
		this.aBoolean225 = true;
		for (@Pc(8) Class3_Sub6_Sub18 local8 = (Class3_Sub6_Sub18) this.aClass193_16.method4457(); local8 != null; local8 = (Class3_Sub6_Sub18) this.aClass193_16.method4459()) {
			if (local8.aClass265_1.anInt7613 == 1) {
				local8.method8342();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass23_Sub1_Sub2_Sub1Array1.length; local27++) {
			if (this.aClass23_Sub1_Sub2_Sub1Array1[local27] != null) {
				this.aClass23_Sub1_Sub2_Sub1Array1[local27].method6591();
				this.aClass23_Sub1_Sub2_Sub1Array1[local27] = null;
			}
		}
		this.anInt2818 = 0;
		this.aClass105_5 = new Class105();
		this.anInt2819 = 0;
		this.aClass193_16 = new Class193();
		this.anInt2821 = 0;
		this.method8588();
		Static124.aClass23_Sub5Array1[Static673.anInt7817] = this;
		Static673.anInt7817 = Static673.anInt7817 + 1 & Static241.anIntArray294[Static200.anInt3634];
	}
}
