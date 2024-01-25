import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class273 {

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "Ljava/lang/String;")
	public static final String aString81;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString82;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Lclient!ds;")
	private Class5 aClass5_205;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "Lclient!ds;")
	private Class5 aClass5_206;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
	private int anInt7436 = 0;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "[Lclient!ds;")
	public final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public final int anInt7429;

	static {
		@Pc(10) String local10 = "Unknown";
		try {
			local10 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(16) Exception local16) {
		}
		local10.toLowerCase();
		local10 = "Unknown";
		try {
			local10 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(27) Exception local27) {
		}
		local10.toLowerCase();
		local10 = "Unknown";
		try {
			local10 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(38) Exception local38) {
		}
		aString81 = local10.toLowerCase();
		local10 = "Unknown";
		try {
			local10 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(49) Exception local49) {
		}
		aString82 = local10.toLowerCase();
		local10 = "Unknown";
		try {
			local10 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(60) Exception local60) {
		}
		local10.toLowerCase();
		local10 = "~/";
		try {
			local10 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(71) Exception local71) {
		}
		new File(local10);
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V")
	public Class273(@OriginalArg(0) int arg0) {
		this.aClass5Array1 = new Class5[arg0];
		this.anInt7429 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_300 = local23;
			local23.aClass5_299 = local23;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Lclient!ds;")
	public Class5 method6577() {
		this.anInt7436 = 0;
		return this.method6589();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I")
	public int method6580() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt7429; local9++) {
			@Pc(16) Class5 local16 = this.aClass5Array1[local9];
			@Pc(19) Class5 local19 = local16.aClass5_300;
			while (local16 != local19) {
				local19 = local19.aClass5_300;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZJ)Lclient!ds;")
	public Class5 method6581(@OriginalArg(1) long arg0) {
		this.aLong188 = arg0;
		@Pc(24) Class5 local24 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt7429 - 1))];
		for (this.aClass5_205 = local24.aClass5_300; this.aClass5_205 != local24; this.aClass5_205 = this.aClass5_205.aClass5_300) {
			if (arg0 == this.aClass5_205.aLong278) {
				@Pc(38) Class5 local38 = this.aClass5_205;
				this.aClass5_205 = this.aClass5_205.aClass5_300;
				return local38;
			}
		}
		this.aClass5_205 = null;
		return null;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Lclient!ds;")
	public Class5 method6582() {
		if (this.aClass5_205 == null) {
			return null;
		}
		@Pc(23) Class5 local23 = this.aClass5Array1[(int) ((long) (this.anInt7429 - 1) & this.aLong188)];
		while (local23 != this.aClass5_205) {
			if (this.aClass5_205.aLong278 == this.aLong188) {
				@Pc(35) Class5 local35 = this.aClass5_205;
				this.aClass5_205 = this.aClass5_205.aClass5_300;
				return local35;
			}
			this.aClass5_205 = this.aClass5_205.aClass5_300;
		}
		this.aClass5_205 = null;
		return null;
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)I")
	public int method6583() {
		return this.anInt7429;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([Lclient!ds;I)I")
	public int method6584(@OriginalArg(0) Class5[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt7429; local17++) {
			@Pc(24) Class5 local24 = this.aClass5Array1[local17];
			for (@Pc(27) Class5 local27 = local24.aClass5_300; local27 != local24; local27 = local27.aClass5_300) {
				arg0[local7++] = local27;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJLclient!ds;)V")
	public void method6585(@OriginalArg(1) long arg0, @OriginalArg(2) Class5 arg1) {
		if (arg1.aClass5_299 != null) {
			arg1.method9047();
		}
		@Pc(27) Class5 local27 = this.aClass5Array1[(int) ((long) (this.anInt7429 - 1) & arg0)];
		arg1.aClass5_300 = local27;
		arg1.aClass5_299 = local27.aClass5_299;
		arg1.aClass5_299.aClass5_300 = arg1;
		arg1.aLong278 = arg0;
		arg1.aClass5_300.aClass5_299 = arg1;
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
	public void method6586() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7429; local3++) {
			@Pc(10) Class5 local10 = this.aClass5Array1[local3];
			while (true) {
				@Pc(13) Class5 local13 = local10.aClass5_300;
				if (local13 == local10) {
					break;
				}
				local13.method9047();
			}
		}
		this.aClass5_206 = null;
		this.aClass5_205 = null;
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)Lclient!ds;")
	public Class5 method6589() {
		@Pc(25) Class5 local25;
		if (this.anInt7436 > 0 && this.aClass5_206 != this.aClass5Array1[this.anInt7436 - 1]) {
			local25 = this.aClass5_206;
			this.aClass5_206 = local25.aClass5_300;
			return local25;
		}
		while (this.anInt7436 < this.anInt7429) {
			local25 = this.aClass5Array1[this.anInt7436++].aClass5_300;
			if (local25 != this.aClass5Array1[this.anInt7436 - 1]) {
				this.aClass5_206 = local25.aClass5_300;
				return local25;
			}
		}
		return null;
	}
}
