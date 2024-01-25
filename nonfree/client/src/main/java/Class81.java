import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class81 {

	@OriginalMember(owner = "client!du", name = "h", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "Lclient!pb;")
	private Class5 aClass5_61;

	@OriginalMember(owner = "client!du", name = "v", descriptor = "Lclient!pb;")
	private Class5 aClass5_62;

	@OriginalMember(owner = "client!du", name = "w", descriptor = "I")
	private int anInt1734 = 0;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "[Lclient!pb;")
	public final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!du", name = "u", descriptor = "I")
	public final int anInt1733;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(I)V")
	public Class81(@OriginalArg(0) int arg0) {
		this.aClass5Array1 = new Class5[arg0];
		this.anInt1733 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_299 = local23;
			local23.aClass5_300 = local23;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(JB)Lclient!pb;")
	public Class5 method1599(@OriginalArg(0) long arg0) {
		this.aLong66 = arg0;
		@Pc(20) Class5 local20 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt1733 - 1))];
		for (this.aClass5_61 = local20.aClass5_299; this.aClass5_61 != local20; this.aClass5_61 = this.aClass5_61.aClass5_299) {
			if (arg0 == this.aClass5_61.aLong282) {
				@Pc(39) Class5 local39 = this.aClass5_61;
				this.aClass5_61 = this.aClass5_61.aClass5_299;
				return local39;
			}
		}
		this.aClass5_61 = null;
		return null;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	public void method1602() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1733; local3++) {
			@Pc(10) Class5 local10 = this.aClass5Array1[local3];
			while (true) {
				@Pc(13) Class5 local13 = local10.aClass5_299;
				if (local10 == local13) {
					break;
				}
				local13.method8911();
			}
		}
		this.aClass5_61 = null;
		this.aClass5_62 = null;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I")
	public int method1603() {
		return this.anInt1733;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(B)Lclient!pb;")
	public Class5 method1605() {
		if (this.aClass5_61 == null) {
			return null;
		}
		@Pc(23) Class5 local23 = this.aClass5Array1[(int) (this.aLong66 & (long) (this.anInt1733 - 1))];
		while (this.aClass5_61 != local23) {
			if (this.aClass5_61.aLong282 == this.aLong66) {
				@Pc(47) Class5 local47 = this.aClass5_61;
				this.aClass5_61 = this.aClass5_61.aClass5_299;
				return local47;
			}
			this.aClass5_61 = this.aClass5_61.aClass5_299;
		}
		this.aClass5_61 = null;
		return null;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "([Lclient!pb;Z)I")
	public int method1606(@OriginalArg(0) Class5[] arg0) {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt1733; local17++) {
			@Pc(24) Class5 local24 = this.aClass5Array1[local17];
			for (@Pc(27) Class5 local27 = local24.aClass5_299; local27 != local24; local27 = local27.aClass5_299) {
				arg0[local15++] = local27;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ILclient!pb;J)V")
	public void method1607(@OriginalArg(1) Class5 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass5_300 != null) {
			arg0.method8911();
		}
		@Pc(21) Class5 local21 = this.aClass5Array1[(int) (arg1 & (long) (this.anInt1733 - 1))];
		arg0.aClass5_299 = local21;
		arg0.aClass5_300 = local21.aClass5_300;
		arg0.aClass5_300.aClass5_299 = arg0;
		arg0.aLong282 = arg1;
		arg0.aClass5_299.aClass5_300 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)Lclient!pb;")
	public Class5 method1608() {
		this.anInt1734 = 0;
		return this.method1610();
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(Z)Lclient!pb;")
	public Class5 method1610() {
		@Pc(21) Class5 local21;
		if (this.anInt1734 > 0 && this.aClass5Array1[this.anInt1734 - 1] != this.aClass5_62) {
			local21 = this.aClass5_62;
			this.aClass5_62 = local21.aClass5_299;
			return local21;
		}
		while (this.anInt1733 > this.anInt1734) {
			local21 = this.aClass5Array1[this.anInt1734++].aClass5_299;
			if (local21 != this.aClass5Array1[this.anInt1734 - 1]) {
				this.aClass5_62 = local21.aClass5_299;
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(B)I")
	public int method1611() {
		@Pc(7) int local7 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1733; local15++) {
			@Pc(22) Class5 local22 = this.aClass5Array1[local15];
			@Pc(25) Class5 local25 = local22.aClass5_299;
			while (local22 != local25) {
				local25 = local25.aClass5_299;
				local7++;
			}
		}
		return local7;
	}
}
