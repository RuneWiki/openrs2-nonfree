import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VGFLNLXH")
public final class Class40 {

	@OriginalMember(owner = "client!VGFLNLXH", name = "f", descriptor = "Lclient!CZLFLPZK;")
	private Class6 aClass6_34;

	@OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!VGFLNLXH", name = "b", descriptor = "I")
	private int anInt700 = -420;

	@OriginalMember(owner = "client!VGFLNLXH", name = "c", descriptor = "I")
	private int anInt701 = -942;

	@OriginalMember(owner = "client!VGFLNLXH", name = "d", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!VGFLNLXH", name = "e", descriptor = "Lclient!CZLFLPZK;")
	private Class6 aClass6_33 = new Class6();

	@OriginalMember(owner = "client!VGFLNLXH", name = "<init>", descriptor = "(I)V")
	public Class40(@OriginalArg(0) int arg0) {
		try {
			this.aClass6_33.aClass6_41 = this.aClass6_33;
			this.aClass6_33.aClass6_42 = this.aClass6_33;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("89630, " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "(Lclient!CZLFLPZK;)V")
	public void method469(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_42 != null) {
			arg0.method542();
		}
		arg0.aClass6_42 = this.aClass6_33.aClass6_42;
		arg0.aClass6_41 = this.aClass6_33;
		arg0.aClass6_42.aClass6_41 = arg0;
		arg0.aClass6_41.aClass6_42 = arg0;
	}

	@OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "(Lclient!CZLFLPZK;Z)V")
	public void method470(@OriginalArg(0) Class6 arg0) {
		try {
			if (arg0.aClass6_42 != null) {
				arg0.method542();
			}
			arg0.aClass6_42 = this.aClass6_33;
			arg0.aClass6_41 = this.aClass6_33.aClass6_41;
			arg0.aClass6_42.aClass6_41 = arg0;
			arg0.aClass6_41.aClass6_42 = arg0;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("16589, " + arg0 + ", " + true + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "()Lclient!CZLFLPZK;")
	public Class6 method471() {
		@Pc(3) Class6 local3 = this.aClass6_33.aClass6_41;
		if (local3 == this.aClass6_33) {
			return null;
		} else {
			local3.method542();
			return local3;
		}
	}

	@OriginalMember(owner = "client!VGFLNLXH", name = "b", descriptor = "()Lclient!CZLFLPZK;")
	public Class6 method472() {
		@Pc(3) Class6 local3 = this.aClass6_33.aClass6_41;
		if (local3 == this.aClass6_33) {
			this.aClass6_34 = null;
			return null;
		} else {
			this.aClass6_34 = local3.aClass6_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "(B)Lclient!CZLFLPZK;")
	public Class6 method473() {
		try {
			@Pc(3) Class6 local3 = this.aClass6_33.aClass6_42;
			if (local3 == this.aClass6_33) {
				this.aClass6_34 = null;
				return null;
			} else {
				this.aClass6_34 = local3.aClass6_42;
				return local3;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("71696, " + 108 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VGFLNLXH", name = "a", descriptor = "(I)Lclient!CZLFLPZK;")
	public Class6 method474() {
		try {
			@Pc(2) Class6 local2 = this.aClass6_34;
			if (local2 == this.aClass6_33) {
				this.aClass6_34 = null;
				return null;
			} else {
				this.aClass6_34 = local2.aClass6_41;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("77013, " + -420 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VGFLNLXH", name = "b", descriptor = "(B)Lclient!CZLFLPZK;")
	public Class6 method475(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class6 local2 = this.aClass6_34;
			if (arg0 != 100) {
				this.aBoolean166 = !this.aBoolean166;
			}
			if (local2 == this.aClass6_33) {
				this.aClass6_34 = null;
				return null;
			} else {
				this.aClass6_34 = local2.aClass6_42;
				return local2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("31646, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VGFLNLXH", name = "c", descriptor = "()V")
	public void method476() {
		if (this.aClass6_33.aClass6_41 == this.aClass6_33) {
			return;
		}
		while (true) {
			@Pc(10) Class6 local10 = this.aClass6_33.aClass6_41;
			if (local10 == this.aClass6_33) {
				return;
			}
			local10.method542();
		}
	}
}
