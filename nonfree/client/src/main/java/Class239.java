import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class239 {

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "Lclient!fg;")
	public Class97 aClass97_1;

	@OriginalMember(owner = "client!nu", name = "n", descriptor = "[I")
	private int[] anIntArray445;

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "[I")
	private final int[] anIntArray446 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)Lclient!id;")
	public Class142 method6100() {
		if (this.anIntArray445 == null) {
			return null;
		}
		@Pc(15) Class142[] local15 = new Class142[this.anIntArray445.length];
		@Pc(19) Class181 local19 = this.aClass97_1.aClass181_33;
		@Pc(23) int local23;
		synchronized (this.aClass97_1.aClass181_33) {
			local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray445.length) {
					break;
				}
				local15[local23] = Static579.method8023(this.anIntArray445[local23], this.aClass97_1.aClass181_33);
				local23++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anIntArray445.length; local59++) {
			if (local15[local59].anInt5151 < 13) {
				local15[local59].method4357();
			}
		}
		@Pc(98) Class142 local98;
		if (local15.length == 1) {
			local98 = local15[0];
		} else {
			local98 = new Class142(local15, local15.length);
		}
		if (local98 == null) {
			return null;
		}
		if (this.aShortArray108 != null) {
			for (local23 = 0; local23 < this.aShortArray108.length; local23++) {
				local98.method4371(this.aShortArray108[local23], this.aShortArray110[local23]);
			}
		}
		if (this.aShortArray107 != null) {
			for (local23 = 0; local23 < this.aShortArray107.length; local23++) {
				local98.method4359(this.aShortArray109[local23], this.aShortArray107[local23]);
			}
		}
		return local98;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)Z")
	public boolean method6101() {
		if (this.anIntArray445 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		@Pc(16) Class181 local16 = this.aClass97_1.aClass181_33;
		synchronized (this.aClass97_1.aClass181_33) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray445.length; local20++) {
				if (!this.aClass97_1.aClass181_33.method5024(0, this.anIntArray445[local20])) {
					local12 = false;
				}
			}
			return local12;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!tn;B)V")
	private void method6103(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			arg1.method8401();
			return;
		}
		@Pc(29) int local29;
		@Pc(39) int local39;
		if (arg0 == 2) {
			local29 = arg1.method8401();
			this.anIntArray445 = new int[local29];
			for (local39 = 0; local39 < local29; local39++) {
				this.anIntArray445[local39] = arg1.method8414();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local29 = arg1.method8401();
				this.aShortArray108 = new short[local29];
				this.aShortArray110 = new short[local29];
				for (local39 = 0; local39 < local29; local39++) {
					this.aShortArray108[local39] = (short) arg1.method8414();
					this.aShortArray110[local39] = (short) arg1.method8414();
				}
				return;
			}
			if (arg0 == 41) {
				local29 = arg1.method8401();
				this.aShortArray107 = new short[local29];
				this.aShortArray109 = new short[local29];
				for (local39 = 0; local39 < local29; local39++) {
					this.aShortArray107[local39] = (short) arg1.method8414();
					this.aShortArray109[local39] = (short) arg1.method8414();
				}
				return;
			}
			if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray446[arg0 - 60] = arg1.method8414();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!tn;)V")
	public void method6104(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8401();
			if (local5 == 0) {
				return;
			}
			this.method6103(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(B)Z")
	public boolean method6105() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class181 local11 = this.aClass97_1.aClass181_33;
		synchronized (this.aClass97_1.aClass181_33) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray446[local15] != -1 && !this.aClass97_1.aClass181_33.method5024(0, this.anIntArray446[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)Lclient!id;")
	public Class142 method6106() {
		@Pc(8) Class142[] local8 = new Class142[5];
		@Pc(15) int local15 = 0;
		@Pc(19) Class181 local19 = this.aClass97_1.aClass181_33;
		@Pc(23) int local23;
		synchronized (this.aClass97_1.aClass181_33) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray446[local23] != -1) {
					local8[local15++] = Static579.method8023(this.anIntArray446[local23], this.aClass97_1.aClass181_33);
				}
				local23++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < 5; local59++) {
			if (local8[local59] != null && local8[local59].anInt5151 < 13) {
				local8[local59].method4357();
			}
		}
		@Pc(89) Class142 local89 = new Class142(local8, local15);
		if (this.aShortArray108 != null) {
			for (local23 = 0; local23 < this.aShortArray108.length; local23++) {
				local89.method4371(this.aShortArray108[local23], this.aShortArray110[local23]);
			}
		}
		if (this.aShortArray107 != null) {
			for (local23 = 0; local23 < this.aShortArray107.length; local23++) {
				local89.method4359(this.aShortArray109[local23], this.aShortArray107[local23]);
			}
		}
		return local89;
	}
}
