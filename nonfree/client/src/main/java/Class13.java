import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FEIPMYNH")
public final class Class13 {

	@OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!FEIPMYNH", name = "d", descriptor = "Lclient!TVKHSKYG;")
	private Class2 aClass2_14;

	@OriginalMember(owner = "client!FEIPMYNH", name = "b", descriptor = "Z")
	private boolean aBoolean64 = true;

	@OriginalMember(owner = "client!FEIPMYNH", name = "c", descriptor = "Lclient!TVKHSKYG;")
	private Class2 aClass2_13 = new Class2();

	@OriginalMember(owner = "client!FEIPMYNH", name = "<init>", descriptor = "(Z)V")
	public Class13(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass2_13.aClass2_41 = this.aClass2_13;
			this.aClass2_13.aClass2_42 = this.aClass2_13;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("942, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "(Lclient!TVKHSKYG;)V")
	public void method197(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_42 != null) {
			arg0.method530();
		}
		arg0.aClass2_42 = this.aClass2_13.aClass2_42;
		arg0.aClass2_41 = this.aClass2_13;
		arg0.aClass2_42.aClass2_41 = arg0;
		arg0.aClass2_41.aClass2_42 = arg0;
	}

	@OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "(ZLclient!TVKHSKYG;)V")
	public void method198(@OriginalArg(1) Class2 arg0) {
		try {
			if (arg0.aClass2_42 != null) {
				arg0.method530();
			}
			arg0.aClass2_42 = this.aClass2_13;
			arg0.aClass2_41 = this.aClass2_13.aClass2_41;
			arg0.aClass2_42.aClass2_41 = arg0;
			arg0.aClass2_41.aClass2_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("90339, " + false + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "()Lclient!TVKHSKYG;")
	public Class2 method199() {
		@Pc(3) Class2 local3 = this.aClass2_13.aClass2_41;
		if (local3 == this.aClass2_13) {
			return null;
		} else {
			local3.method530();
			return local3;
		}
	}

	@OriginalMember(owner = "client!FEIPMYNH", name = "b", descriptor = "()Lclient!TVKHSKYG;")
	public Class2 method200() {
		@Pc(3) Class2 local3 = this.aClass2_13.aClass2_41;
		if (local3 == this.aClass2_13) {
			this.aClass2_14 = null;
			return null;
		} else {
			this.aClass2_14 = local3.aClass2_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "(I)Lclient!TVKHSKYG;")
	public Class2 method201(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class2 local3 = this.aClass2_13.aClass2_42;
			if (local3 == this.aClass2_13) {
				this.aClass2_14 = null;
				return null;
			} else {
				this.aClass2_14 = local3.aClass2_42;
				@Pc(20) boolean local20 = false;
				return local3;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("97540, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEIPMYNH", name = "a", descriptor = "(Z)Lclient!TVKHSKYG;")
	public Class2 method202() {
		try {
			@Pc(2) Class2 local2 = this.aClass2_14;
			if (local2 == this.aClass2_13) {
				this.aClass2_14 = null;
				return null;
			} else {
				this.aClass2_14 = local2.aClass2_41;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("7848, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEIPMYNH", name = "b", descriptor = "(I)Lclient!TVKHSKYG;")
	public Class2 method203() {
		try {
			@Pc(2) Class2 local2 = this.aClass2_14;
			if (local2 == this.aClass2_13) {
				this.aClass2_14 = null;
				return null;
			} else {
				this.aClass2_14 = local2.aClass2_42;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("94114, " + 318 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEIPMYNH", name = "c", descriptor = "()V")
	public void method204() {
		if (this.aClass2_13.aClass2_41 == this.aClass2_13) {
			return;
		}
		while (true) {
			@Pc(10) Class2 local10 = this.aClass2_13.aClass2_41;
			if (local10 == this.aClass2_13) {
				return;
			}
			local10.method530();
		}
	}
}
