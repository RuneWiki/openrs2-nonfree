import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class9_Sub5 extends Class9 {

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!lba", name = "r", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!lba", name = "w", descriptor = "I")
	public int anInt6238;

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
	public int anInt6235 = 0;

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "Z")
	public boolean aBoolean486 = false;

	@OriginalMember(owner = "client!lba", name = "m", descriptor = "Z")
	private boolean aBoolean485 = false;

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "Lclient!o;")
	private Class234 aClass234_6 = new Class234();

	@OriginalMember(owner = "client!lba", name = "t", descriptor = "I")
	private int anInt6236 = 0;

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "Lclient!kba;")
	public Class163 aClass163_34 = new Class163();

	@OriginalMember(owner = "client!lba", name = "v", descriptor = "I")
	private int anInt6237 = 0;

	@OriginalMember(owner = "client!lba", name = "y", descriptor = "Z")
	public boolean aBoolean488 = false;

	@OriginalMember(owner = "client!lba", name = "x", descriptor = "Z")
	private boolean aBoolean487 = false;

	@OriginalMember(owner = "client!lba", name = "u", descriptor = "Lclient!pf;")
	public final Class257 aClass257_1 = new Class257();

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "[Lclient!ae;")
	public final Class9_Sub1_Sub1_Sub1[] aClass9_Sub1_Sub1_Sub1Array1 = new Class9_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(IZ)V")
	public Class9_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method5230(arg0, arg1);
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "()V")
	public void method5220() {
		this.aBoolean485 = true;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "()Lclient!pf;")
	public Class257 method5221() {
		this.aClass257_1.aClass362_1.method8365();
		for (@Pc(6) int local6 = 0; local6 < this.aClass9_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass9_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass9_Sub1_Sub1_Sub1Array1[local6].aClass9_Sub9_1 != null) {
				this.aClass257_1.aClass362_1.method8370(this.aClass9_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass257_1;
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "()Lclient!pf;")
	public Class257 method5222() {
		return this.aClass257_1;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!ha;)V")
	public void method5224(@OriginalArg(0) Class5 arg0) {
		this.aClass257_1.aClass362_1.method8365();
		for (@Pc(10) Class9_Sub9 local10 = (Class9_Sub9) this.aClass234_6.method6092(); local10 != null; local10 = (Class9_Sub9) this.aClass234_6.method6098()) {
			local10.method6879(this.aLong169, arg0);
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!ha;[Lclient!fk;Z)V")
	private void method5225(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class103[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			Static311.aBooleanArray13[local1] = false;
		}
		@Pc(21) int local21;
		label62: for (@Pc(16) Class9_Sub9 local16 = (Class9_Sub9) this.aClass234_6.method6092(); local16 != null; local16 = (Class9_Sub9) this.aClass234_6.method6098()) {
			if (arg1 != null) {
				for (local21 = 0; local21 < arg1.length; local21++) {
					if (local16.aClass103_2 == arg1[local21] || local16.aClass103_2 == arg1[local21].aClass103_1) {
						Static311.aBooleanArray13[local21] = true;
						local16.method6883();
						local16.aBoolean656 = false;
						continue label62;
					}
				}
			}
			if (local16.anInt8175 == 0) {
				local16.method8408();
				this.anInt6236--;
			} else {
				local16.aBoolean656 = true;
			}
		}
		if (arg1 == null) {
			return;
		}
		for (local21 = 0; local21 < arg1.length && local21 != 32 && this.anInt6236 != 32; local21++) {
			if (!Static311.aBooleanArray13[local21]) {
				@Pc(104) Class9_Sub9 local104 = new Class9_Sub9(arg0, arg1[local21], this, this.aLong170);
				this.aClass234_6.method6097(local104);
				this.anInt6236++;
				Static311.aBooleanArray13[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!ha;J[Lclient!fk;[Lclient!cia;Z)V")
	public void method5226(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class103[] arg2, @OriginalArg(3) Class49[] arg3) {
		if (!this.aBoolean486) {
			this.method5225(arg0, arg2);
			this.method5228(arg3);
			this.aLong170 = arg1;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!ha;J)Z")
	public boolean method5227(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong170 == this.aLong169) {
			this.method5234();
		} else {
			this.method5220();
		}
		if (arg1 - this.aLong170 > 750L) {
			this.method5235();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong169);
		@Pc(36) Class9_Sub9 local36;
		if (this.aBoolean487) {
			for (local36 = (Class9_Sub9) this.aClass234_6.method6092(); local36 != null; local36 = (Class9_Sub9) this.aClass234_6.method6098()) {
				for (@Pc(39) int local39 = 0; local39 < local36.aClass108_1.anInt3730; local39++) {
					local36.method6880(arg0, !this.aBoolean485, arg1, 1);
				}
			}
			this.aBoolean487 = false;
		}
		for (local36 = (Class9_Sub9) this.aClass234_6.method6092(); local36 != null; local36 = (Class9_Sub9) this.aClass234_6.method6098()) {
			local36.method6880(arg0, !this.aBoolean485, arg1, local27);
		}
		this.aLong169 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([Lclient!cia;Z)V")
	private void method5228(@OriginalArg(0) Class49[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < 8; local1++) {
			Static311.aBooleanArray12[local1] = false;
		}
		@Pc(21) int local21;
		label71: for (@Pc(16) Class6_Sub5_Sub7 local16 = (Class6_Sub5_Sub7) this.aClass163_34.method4966(); local16 != null; local16 = (Class6_Sub5_Sub7) this.aClass163_34.method4965()) {
			if (arg0 != null) {
				for (local21 = 0; local21 < arg0.length; local21++) {
					if (local16.aClass49_2 == arg0[local21] || local16.aClass49_2 == arg0[local21].aClass49_1) {
						Static311.aBooleanArray12[local21] = true;
						local16.method2381();
						continue label71;
					}
				}
			}
			local16.method8792();
			this.anInt6237--;
			if (local16.method7746()) {
				local16.method7748();
				Static579.anInt9861--;
			}
		}
		if (arg0 == null) {
			return;
		}
		for (local21 = 0; local21 < arg0.length && local21 != 8 && this.anInt6237 != 8; local21++) {
			if (!Static311.aBooleanArray12[local21]) {
				@Pc(96) Class6_Sub5_Sub7 local96 = null;
				if (arg0[local21].method2062().anInt3151 == 1 && Static579.anInt9861 < 32) {
					local96 = new Class6_Sub5_Sub7(arg0[local21], this);
					Static275.aClass268_3.method6816(local96, (long) arg0[local21].anInt2380);
					Static579.anInt9861++;
				}
				if (local96 == null) {
					local96 = new Class6_Sub5_Sub7(arg0[local21], this);
				}
				this.aClass163_34.method4967(local96);
				this.anInt6237++;
				Static311.aBooleanArray12[local21] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIII)V")
	public void method5229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6238 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(IZ)V")
	public void method5230(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Static470.aClass234_11.method6097(this);
		this.aLong170 = (long) arg0;
		this.aLong169 = (long) arg0;
		this.aBoolean487 = true;
		this.aBoolean488 = arg1;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(J)V")
	public void method5232(@OriginalArg(0) long arg0) {
		this.aLong170 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "()V")
	public void method5233() {
		this.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "()V")
	private void method5234() {
		this.aBoolean485 = false;
	}

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "()V")
	public void method5235() {
		this.aBoolean486 = true;
		for (@Pc(8) Class6_Sub5_Sub7 local8 = (Class6_Sub5_Sub7) this.aClass163_34.method4966(); local8 != null; local8 = (Class6_Sub5_Sub7) this.aClass163_34.method4965()) {
			if (local8.aClass81_1.anInt3151 == 1) {
				local8.method7748();
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.aClass9_Sub1_Sub1_Sub1Array1.length; local27++) {
			if (this.aClass9_Sub1_Sub1_Sub1Array1[local27] != null) {
				this.aClass9_Sub1_Sub1_Sub1Array1[local27].method484();
				this.aClass9_Sub1_Sub1_Sub1Array1[local27] = null;
			}
		}
		this.anInt6235 = 0;
		this.aClass234_6 = new Class234();
		this.anInt6236 = 0;
		this.aClass163_34 = new Class163();
		this.anInt6237 = 0;
		this.method8408();
		Static82.aClass9_Sub5Array1[Static478.anInt8414] = this;
		Static478.anInt8414 = Static478.anInt8414 + 1 & Static85.anIntArray87[Static114.anInt2971];
	}
}
