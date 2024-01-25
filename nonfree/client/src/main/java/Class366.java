import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class366 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!ds;")
	public Class83 aClass83_1;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
	private int[] anIntArray568;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "[I")
	private final int[] anIntArray569 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Lclient!hm;")
	public Class156 method8295() {
		if (this.anIntArray568 == null) {
			return null;
		}
		@Pc(13) Class156[] local13 = new Class156[this.anIntArray568.length];
		@Pc(17) Class50 local17 = this.aClass83_1.aClass50_32;
		@Pc(21) int local21;
		synchronized (this.aClass83_1.aClass50_32) {
			local21 = 0;
			while (true) {
				if (this.anIntArray568.length <= local21) {
					break;
				}
				local13[local21] = Static437.method6555(this.aClass83_1.aClass50_32, this.anIntArray568[local21]);
				local21++;
			}
		}
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray568.length; local49++) {
			if (local13[local49].anInt3696 < 13) {
				local13[local49].method3275();
			}
		}
		@Pc(83) Class156 local83;
		if (local13.length == 1) {
			local83 = local13[0];
		} else {
			local83 = new Class156(local13, local13.length);
		}
		if (local83 == null) {
			return null;
		}
		if (this.aShortArray127 != null) {
			for (local21 = 0; local21 < this.aShortArray127.length; local21++) {
				local83.method3271(this.aShortArray125[local21], this.aShortArray127[local21]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local21 = 0; local21 < this.aShortArray126.length; local21++) {
				local83.method3286(this.aShortArray124[local21], this.aShortArray126[local21]);
			}
		}
		return local83;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!rv;I)V")
	private void method8296(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			arg1.method3642();
			return;
		}
		@Pc(51) int local51;
		@Pc(61) int local61;
		if (arg0 == 2) {
			local51 = arg1.method3642();
			this.anIntArray568 = new int[local51];
			for (local61 = 0; local61 < local51; local61++) {
				this.anIntArray568[local61] = arg1.method3698();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local51 = arg1.method3642();
				this.aShortArray125 = new short[local51];
				this.aShortArray127 = new short[local51];
				for (local61 = 0; local61 < local51; local61++) {
					this.aShortArray127[local61] = (short) arg1.method3698();
					this.aShortArray125[local61] = (short) arg1.method3698();
				}
			} else if (arg0 == 41) {
				local51 = arg1.method3642();
				this.aShortArray124 = new short[local51];
				this.aShortArray126 = new short[local51];
				for (local61 = 0; local61 < local51; local61++) {
					this.aShortArray126[local61] = (short) arg1.method3698();
					this.aShortArray124[local61] = (short) arg1.method3698();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray569[arg0 - 60] = arg1.method3698();
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Z")
	public boolean method8298() {
		@Pc(11) boolean local11 = true;
		@Pc(15) Class50 local15 = this.aClass83_1.aClass50_32;
		synchronized (this.aClass83_1.aClass50_32) {
			for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
				if (this.anIntArray569[local19] != -1 && !this.aClass83_1.aClass50_32.method901(0, this.anIntArray569[local19])) {
					local11 = false;
				}
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Z")
	public boolean method8300() {
		if (this.anIntArray568 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		@Pc(19) Class50 local19 = this.aClass83_1.aClass50_32;
		synchronized (this.aClass83_1.aClass50_32) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray568.length; local23++) {
				if (!this.aClass83_1.aClass50_32.method901(0, this.anIntArray568[local23])) {
					local10 = false;
				}
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method8301(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3642();
			if (local11 == 0) {
				return;
			}
			this.method8296(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Lclient!hm;")
	public Class156 method8302() {
		@Pc(11) Class156[] local11 = new Class156[5];
		@Pc(13) int local13 = 0;
		@Pc(17) Class50 local17 = this.aClass83_1.aClass50_32;
		@Pc(21) int local21;
		synchronized (this.aClass83_1.aClass50_32) {
			local21 = 0;
			while (true) {
				if (local21 >= 5) {
					break;
				}
				if (this.anIntArray569[local21] != -1) {
					local11[local13++] = Static437.method6555(this.aClass83_1.aClass50_32, this.anIntArray569[local21]);
				}
				local21++;
			}
		}
		for (@Pc(54) int local54 = 0; local54 < 5; local54++) {
			if (local11[local54] != null && local11[local54].anInt3696 < 13) {
				local11[local54].method3275();
			}
		}
		@Pc(83) Class156 local83 = new Class156(local11, local13);
		if (this.aShortArray127 != null) {
			for (local21 = 0; local21 < this.aShortArray127.length; local21++) {
				local83.method3271(this.aShortArray125[local21], this.aShortArray127[local21]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local21 = 0; local21 < this.aShortArray126.length; local21++) {
				local83.method3286(this.aShortArray124[local21], this.aShortArray126[local21]);
			}
		}
		return local83;
	}
}
