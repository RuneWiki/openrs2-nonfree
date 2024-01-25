import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class12_Sub4 extends Class12 {

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "J")
	private long aLong48;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
	public int anInt1878;

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "I")
	public int anInt1876 = 0;

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "Lclient!vv;")
	private Class376 aClass376_2 = new Class376();

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
	private int anInt1877 = 0;

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "Lclient!ok;")
	public Class262 aClass262_10 = new Class262();

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
	private int anInt1879 = 0;

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "Lclient!kd;")
	public final Class196 aClass196_1 = new Class196();

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "[Lclient!uk;")
	public final Class12_Sub7_Sub2_Sub1[] aClass12_Sub7_Sub2_Sub1Array1 = new Class12_Sub7_Sub2_Sub1[8192];

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(IZ)V")
	public Class12_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method1610(arg0, arg1);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(J)V")
	public void method1609(@OriginalArg(0) long arg0) {
		this.aLong48 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IZ)V")
	public void method1610(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static319.aClass376_5.method9011(this);
		this.aLong48 = (long) arg0;
		this.aLong49 = (long) arg0;
		this.aBoolean156 = true;
		this.aBoolean157 = arg1;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method1611(@OriginalArg(0) Class137 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong48 == this.aLong49) {
			this.method1624();
		} else {
			this.method1614();
		}
		if (arg1 - this.aLong48 > 750L) {
			this.method1623();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong49);
		@Pc(36) Class12_Sub10 local36;
		if (this.aBoolean156) {
			for (local36 = (Class12_Sub10) this.aClass376_2.method9008(); local36 != null; local36 = (Class12_Sub10) this.aClass376_2.method9014()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass223_1.anInt6477; local39++) {
					local36.method6573(arg0, arg1, 1, !this.aBoolean154);
				}
			}
			this.aBoolean156 = false;
		}
		for (local36 = (Class12_Sub10) this.aClass376_2.method9008(); local36 != null; local36 = (Class12_Sub10) this.aClass376_2.method9014()) {
			local36.method6573(arg0, arg1, local27, !this.aBoolean154);
		}
		this.aLong49 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "()Lclient!kd;")
	public Class196 method1613() {
		return this.aClass196_1;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "()V")
	public void method1614() {
		this.aBoolean154 = true;
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "()V")
	public void method1615() {
		this.aBoolean156 = true;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([Lclient!oq;Z)V")
	private void method1616(@OriginalArg(0) Class265[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static86.aBooleanArray6[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class14_Sub3_Sub17 local16 = (Class14_Sub3_Sub17) this.aClass262_10.method6318(); local16 != null; local16 = (Class14_Sub3_Sub17) this.aClass262_10.method6311()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass265_2 == arg0[local21] || local16.aClass265_2 == arg0[local21].aClass265_1) {
						Static86.aBooleanArray6[local21] = true;
						local16.method8286();
						continue label71;
					}
				}
			}
			local16.method9315();
			this.anInt1879--;
			if (local16.method9256()) {
				local16.method9253();
				Static131.anInt7933--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt1879 != 8; local21++) {
			if (!Static86.aBooleanArray6[local21]) {
				@Pc(96) Class14_Sub3_Sub17 local96 = null;
				if (arg0[local21].method6432().anInt2590 == 1 && Static131.anInt7933 < 32) {
					local96 = new Class14_Sub3_Sub17(arg0[local21], this);
					Static530.aClass206_1.method5087((long) arg0[local21].anInt7793, local96);
					Static131.anInt7933++;
				}
				if (local96 == null) {
					local96 = new Class14_Sub3_Sub17(arg0[local21], this);
				}
				this.aClass262_10.method6314(local96);
				this.anInt1879++;
				Static86.aBooleanArray6[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!ha;)V")
	public void method1617(@OriginalArg(0) Class137 arg0) {
		this.aClass196_1.aClass243_1.method5915();
		for (@Pc(10) Class12_Sub10 local10 = (Class12_Sub10) this.aClass376_2.method9008(); local10 != null; local10 = (Class12_Sub10) this.aClass376_2.method9014()) {
			local10.method6570(this.aLong49, arg0);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!ha;[Lclient!gv;Z)V")
	private void method1618(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class136[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static86.aBooleanArray7[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class12_Sub10 local16 = (Class12_Sub10) this.aClass376_2.method9008(); local16 != null; local16 = (Class12_Sub10) this.aClass376_2.method9014()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass136_2 == arg1[local21] || local16.aClass136_2 == arg1[local21].aClass136_1) {
						Static86.aBooleanArray7[local21] = true;
						local16.method6575();
						local16.aBoolean548 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt7951 == 0) {
				local16.method9143();
				this.anInt1877--;
			} else {
				local16.aBoolean548 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt1877 != 32; local21++) {
			if (!Static86.aBooleanArray7[local21]) {
				@Pc(104) Class12_Sub10 local104 = new Class12_Sub10(arg0, arg1[local21], this, this.aLong48);
				this.aClass376_2.method9011(local104);
				this.anInt1877++;
				Static86.aBooleanArray7[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "()Lclient!kd;")
	public Class196 method1619() {
		this.aClass196_1.aClass243_1.method5915();
		for (@Pc(6) int local6 = 0; local6 < this.aClass12_Sub7_Sub2_Sub1Array1.length; local6++) {
			if (this.aClass12_Sub7_Sub2_Sub1Array1[local6] != null && this.aClass12_Sub7_Sub2_Sub1Array1[local6].aClass12_Sub10_1 != null) {
				this.aClass196_1.aClass243_1.method5914(this.aClass12_Sub7_Sub2_Sub1Array1[local6]);
			}
		}
		return this.aClass196_1;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!ha;J[Lclient!gv;[Lclient!oq;Z)V")
	public void method1620(@OriginalArg(0) Class137 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class136[] arg2, @OriginalArg(3) Class265[] arg3) {
		if (!this.aBoolean155) {
			this.method1618(arg0, arg2);
			this.method1616(arg3);
			this.aLong48 = arg1;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIII)V")
	public void method1621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1878 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "()V")
	public void method1623() {
		this.aBoolean155 = true;
		for (@Pc(8) Class14_Sub3_Sub17 local8 = (Class14_Sub3_Sub17) this.aClass262_10.method6318(); local8 != null; local8 = (Class14_Sub3_Sub17) this.aClass262_10.method6311()) {
			if (local8.aClass93_1.anInt2590 == 1) {
				local8.method9253();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass12_Sub7_Sub2_Sub1Array1.length; local27++) {
			if (this.aClass12_Sub7_Sub2_Sub1Array1[local27] != null) {
				this.aClass12_Sub7_Sub2_Sub1Array1[local27].method8540();
				this.aClass12_Sub7_Sub2_Sub1Array1[local27] = null;
			}
		}
		this.anInt1876 = 0;
		this.aClass376_2 = new Class376();
		this.anInt1877 = 0;
		this.aClass262_10 = new Class262();
		this.anInt1879 = 0;
		this.method9143();
		Static128.aClass12_Sub4Array1[Static606.anInt10225] = this;
		Static606.anInt10225 = Static606.anInt10225 + 1 & Static158.anIntArray254[Class12_Sub2_Sub3_Sub1.lb];
	}

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "()V")
	private void method1624() {
		this.aBoolean154 = false;
	}
}
