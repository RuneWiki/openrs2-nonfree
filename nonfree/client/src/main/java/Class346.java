import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class346 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "Lclient!eu;")
	public Class93 aClass93_2;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "[I")
	private int[] anIntArray619;

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "[I")
	private final int[] anIntArray620 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)Lclient!cca;")
	public Class43 method7626() {
		@Pc(8) Class43[] local8 = new Class43[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class111 local14 = this.aClass93_2.aClass111_28;
		@Pc(18) int local18;
		synchronized (this.aClass93_2.aClass111_28) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray620[local18] != -1) {
					local8[local10++] = Static83.method1704(this.aClass93_2.aClass111_28, this.anIntArray620[local18]);
				}
				local18++;
			}
		}
		for (@Pc(63) int local63 = 0; local63 < 5; local63++) {
			if (local8[local63] != null && local8[local63].anInt1481 < 13) {
				local8[local63].method1366();
			}
		}
		@Pc(93) Class43 local93 = new Class43(local8, local10);
		if (this.aShortArray126 != null) {
			for (local18 = 0; local18 < this.aShortArray126.length; local18++) {
				local93.method1371(this.aShortArray126[local18], this.aShortArray127[local18]);
			}
		}
		if (this.aShortArray128 != null) {
			for (local18 = 0; local18 < this.aShortArray128.length; local18++) {
				local93.method1370(this.aShortArray125[local18], this.aShortArray128[local18]);
			}
		}
		return local93;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!io;BI)V")
	private void method7628(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			arg0.method4393();
			return;
		}
		@Pc(23) int local23;
		@Pc(33) int local33;
		if (arg1 == 2) {
			local23 = arg0.method4393();
			this.anIntArray619 = new int[local23];
			for (local33 = 0; local33 < local23; local33++) {
				this.anIntArray619[local33] = arg0.method4426();
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local23 = arg0.method4393();
				this.aShortArray127 = new short[local23];
				this.aShortArray126 = new short[local23];
				for (local33 = 0; local33 < local23; local33++) {
					this.aShortArray126[local33] = (short) arg0.method4426();
					this.aShortArray127[local33] = (short) arg0.method4426();
				}
			} else if (arg1 == 41) {
				local23 = arg0.method4393();
				this.aShortArray128 = new short[local23];
				this.aShortArray125 = new short[local23];
				for (local33 = 0; local33 < local23; local33++) {
					this.aShortArray128[local33] = (short) arg0.method4426();
					this.aShortArray125[local33] = (short) arg0.method4426();
				}
			} else if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray620[arg1 - 60] = arg0.method4426();
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Lclient!cca;")
	public Class43 method7629() {
		if (this.anIntArray619 == null) {
			return null;
		}
		@Pc(15) Class43[] local15 = new Class43[this.anIntArray619.length];
		@Pc(19) Class111 local19 = this.aClass93_2.aClass111_28;
		@Pc(30) int local30;
		synchronized (this.aClass93_2.aClass111_28) {
			local30 = 0;
			while (true) {
				if (this.anIntArray619.length <= local30) {
					break;
				}
				local15[local30] = Static83.method1704(this.aClass93_2.aClass111_28, this.anIntArray619[local30]);
				local30++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anIntArray619.length; local59++) {
			if (local15[local59].anInt1481 < 13) {
				local15[local59].method1366();
			}
		}
		@Pc(90) Class43 local90;
		if (local15.length == 1) {
			local90 = local15[0];
		} else {
			local90 = new Class43(local15, local15.length);
		}
		if (local90 == null) {
			return null;
		}
		if (this.aShortArray126 != null) {
			for (local30 = 0; local30 < this.aShortArray126.length; local30++) {
				local90.method1371(this.aShortArray126[local30], this.aShortArray127[local30]);
			}
		}
		if (this.aShortArray128 != null) {
			for (local30 = 0; local30 < this.aShortArray128.length; local30++) {
				local90.method1370(this.aShortArray125[local30], this.aShortArray128[local30]);
			}
		}
		return local90;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Z")
	public boolean method7630() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class111 local11 = this.aClass93_2.aClass111_28;
		synchronized (this.aClass93_2.aClass111_28) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray620[local15] != -1 && !this.aClass93_2.aClass111_28.method2465(0, this.anIntArray620[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!io;Z)V")
	public void method7633(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4393();
			if (local5 == 0) {
				return;
			}
			this.method7628(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)Z")
	public boolean method7634() {
		if (this.anIntArray619 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		@Pc(22) Class111 local22 = this.aClass93_2.aClass111_28;
		synchronized (this.aClass93_2.aClass111_28) {
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray619.length; local26++) {
				if (!this.aClass93_2.aClass111_28.method2465(0, this.anIntArray619[local26])) {
					local18 = false;
				}
			}
			return local18;
		}
	}
}
