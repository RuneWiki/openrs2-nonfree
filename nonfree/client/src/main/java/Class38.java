import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class38 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!ke;")
	private Class6 aClass6_55;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Lclient!ke;")
	private Class6 aClass6_56;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	private int anInt1732 = 0;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	private final int anInt1726;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "[Lclient!ke;")
	private final Class6[] aClass6Array1;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	public Class38(@OriginalArg(0) int arg0) {
		this.anInt1726 = arg0;
		this.aClass6Array1 = new Class6[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class6 local23 = this.aClass6Array1[local13] = new Class6();
			local23.aClass6_99 = local23;
			local23.aClass6_100 = local23;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)Lclient!ke;")
	public Class6 method1179() {
		if (this.aClass6_55 == null) {
			return null;
		}
		@Pc(29) Class6 local29 = this.aClass6Array1[(int) (this.aLong63 & (long) (this.anInt1726 - 1))];
		while (this.aClass6_55 != local29) {
			if (this.aLong63 == this.aClass6_55.aLong114) {
				@Pc(40) Class6 local40 = this.aClass6_55;
				this.aClass6_55 = this.aClass6_55.aClass6_99;
				return local40;
			}
			this.aClass6_55 = this.aClass6_55.aClass6_99;
		}
		this.aClass6_55 = null;
		return null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lclient!ke;")
	public Class6 method1180() {
		this.anInt1732 = 0;
		return this.method1182();
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Lclient!ke;")
	private Class6 method1182() {
		if (this.anInt1732 > 0 && this.aClass6_56 != this.aClass6Array1[this.anInt1732 - 1]) {
			@Pc(21) Class6 local21 = this.aClass6_56;
			this.aClass6_56 = local21.aClass6_99;
			return local21;
		}
		while (this.anInt1732 < this.anInt1726) {
			@Pc(49) Class6 local49 = this.aClass6Array1[this.anInt1732++].aClass6_99;
			if (local49 != this.aClass6Array1[this.anInt1732 - 1]) {
				this.aClass6_56 = local49.aClass6_99;
				return local49;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BJ)Lclient!ke;")
	public Class6 method1183(@OriginalArg(1) long arg0) {
		this.aLong63 = arg0;
		@Pc(25) Class6 local25 = this.aClass6Array1[(int) (arg0 & (long) (this.anInt1726 - 1))];
		for (this.aClass6_55 = local25.aClass6_99; this.aClass6_55 != local25; this.aClass6_55 = this.aClass6_55.aClass6_99) {
			if (arg0 == this.aClass6_55.aLong114) {
				@Pc(43) Class6 local43 = this.aClass6_55;
				this.aClass6_55 = this.aClass6_55.aClass6_99;
				return local43;
			}
		}
		this.aClass6_55 = null;
		return null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!ke;J)V")
	public void method1184(@OriginalArg(1) Class6 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass6_100 != null) {
			arg0.method2083();
		}
		@Pc(29) Class6 local29 = this.aClass6Array1[(int) ((long) (this.anInt1726 - 1) & arg1)];
		arg0.aClass6_99 = local29;
		arg0.aLong114 = arg1;
		arg0.aClass6_100 = local29.aClass6_100;
		arg0.aClass6_100.aClass6_99 = arg0;
		arg0.aClass6_99.aClass6_100 = arg0;
	}
}
