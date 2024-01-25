import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class180 {

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "Lclient!ps;")
	public Class294 aClass294_2;

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "[I")
	private final int[] anIntArray253 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)Lclient!kc;")
	public Class197 method4241() {
		if (this.anIntArray254 == null) {
			return null;
		}
		@Pc(16) Class197[] local16 = new Class197[this.anIntArray254.length];
		@Pc(20) Class126 local20 = this.aClass294_2.aClass126_215;
		@Pc(24) int local24;
		synchronized (this.aClass294_2.aClass126_215) {
			local24 = 0;
			while (true) {
				if (this.anIntArray254.length <= local24) {
					break;
				}
				local16[local24] = Static485.method8979(this.aClass294_2.aClass126_215, this.anIntArray254[local24]);
				local24++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray254.length; local61++) {
			if (local16[local61].anInt5125 < 13) {
				local16[local61].method4604();
			}
		}
		@Pc(116) Class197 local116;
		if (local16.length == 1) {
			local116 = local16[0];
		} else {
			local116 = new Class197(local16, local16.length);
		}
		if (local116 == null) {
			return null;
		}
		if (this.aShortArray53 != null) {
			for (local24 = 0; local24 < this.aShortArray53.length; local24++) {
				local116.method4597(this.aShortArray53[local24], this.aShortArray55[local24]);
			}
		}
		if (this.aShortArray54 != null) {
			for (local24 = 0; local24 < this.aShortArray54.length; local24++) {
				local116.method4596(this.aShortArray54[local24], this.aShortArray56[local24]);
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZLclient!wq;)V")
	private void method4242(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == 1) {
			arg1.method7291();
			return;
		}
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (arg0 == 2) {
			local23 = arg1.method7291();
			this.anIntArray254 = new int[local23];
			for (local29 = 0; local29 < local23; local29++) {
				this.anIntArray254[local29] = arg1.method7333();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local23 = arg1.method7291();
				this.aShortArray53 = new short[local23];
				this.aShortArray55 = new short[local23];
				for (local29 = 0; local29 < local23; local29++) {
					this.aShortArray53[local29] = (short) arg1.method7333();
					this.aShortArray55[local29] = (short) arg1.method7333();
				}
			} else if (arg0 == 41) {
				local23 = arg1.method7291();
				this.aShortArray54 = new short[local23];
				this.aShortArray56 = new short[local23];
				for (local29 = 0; local29 < local23; local29++) {
					this.aShortArray54[local29] = (short) arg1.method7333();
					this.aShortArray56[local29] = (short) arg1.method7333();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray253[arg0 - 60] = arg1.method7333();
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)Z")
	public boolean method4243() {
		@Pc(16) boolean local16 = true;
		@Pc(20) Class126 local20 = this.aClass294_2.aClass126_215;
		synchronized (this.aClass294_2.aClass126_215) {
			for (@Pc(24) int local24 = 0; local24 < 5; local24++) {
				if (this.anIntArray253[local24] != -1 && !this.aClass294_2.aClass126_215.method3068(this.anIntArray253[local24], 0)) {
					local16 = false;
				}
			}
			return local16;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!wq;)V")
	public void method4244(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method7291();
			if (local12 == 0) {
				return;
			}
			this.method4242(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)Z")
	public boolean method4245() {
		if (this.anIntArray254 == null) {
			return true;
		}
		@Pc(13) boolean local13 = true;
		@Pc(17) Class126 local17 = this.aClass294_2.aClass126_215;
		synchronized (this.aClass294_2.aClass126_215) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray254.length; local21++) {
				if (!this.aClass294_2.aClass126_215.method3068(this.anIntArray254[local21], 0)) {
					local13 = false;
				}
			}
			return local13;
		}
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)Lclient!kc;")
	public Class197 method4246() {
		@Pc(8) Class197[] local8 = new Class197[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class126 local14 = this.aClass294_2.aClass126_215;
		@Pc(18) int local18;
		synchronized (this.aClass294_2.aClass126_215) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray253[local18] != -1) {
					local8[local10++] = Static485.method8979(this.aClass294_2.aClass126_215, this.anIntArray253[local18]);
				}
				local18++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < 5; local61++) {
			if (local8[local61] != null && local8[local61].anInt5125 < 13) {
				local8[local61].method4604();
			}
		}
		@Pc(99) Class197 local99 = new Class197(local8, local10);
		if (this.aShortArray53 != null) {
			for (local18 = 0; local18 < this.aShortArray53.length; local18++) {
				local99.method4597(this.aShortArray53[local18], this.aShortArray55[local18]);
			}
		}
		if (this.aShortArray54 != null) {
			for (local18 = 0; local18 < this.aShortArray54.length; local18++) {
				local99.method4596(this.aShortArray54[local18], this.aShortArray56[local18]);
			}
		}
		return local99;
	}
}
