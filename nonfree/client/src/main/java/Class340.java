import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uia")
public final class Class340 {

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!uia", name = "g", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!uia", name = "h", descriptor = "I")
	private int anInt9436;

	@OriginalMember(owner = "client!uia", name = "k", descriptor = "Lclient!mp;")
	public Class222 aClass222_38;

	@OriginalMember(owner = "client!uia", name = "m", descriptor = "Lclient!mp;")
	private Class222 aClass222_39;

	@OriginalMember(owner = "client!uia", name = "j", descriptor = "Ljava/lang/String;")
	private String aString84 = "null";

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(II)I")
	public int method7878(@OriginalArg(0) int arg0) {
		if (this.aClass222_38 == null) {
			return this.anInt9436;
		} else {
			@Pc(22) Class2_Sub15 local22 = (Class2_Sub15) this.aClass222_38.method5468((long) arg0);
			return local22 == null ? this.anInt9436 : local22.anInt1789;
		}
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method7879(@OriginalArg(0) int arg0) {
		if (this.aClass222_38 == null) {
			return this.aString84;
		} else {
			@Pc(23) Class2_Sub38 local23 = (Class2_Sub38) this.aClass222_38.method5468((long) arg0);
			return local23 == null ? this.aString84 : local23.aString68;
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method7880(@OriginalArg(0) String arg0) {
		if (this.aClass222_38 == null) {
			return false;
		}
		if (this.aClass222_39 == null) {
			this.method7882();
		}
		for (@Pc(23) Class2_Sub39 local23 = (Class2_Sub39) this.aClass222_39.method5468(Static323.method4877(arg0)); local23 != null; local23 = (Class2_Sub39) this.aClass222_39.method5475()) {
			if (local23.aString69.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IILclient!ud;)V")
	private void method7881(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub34 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static448.method6635(arg1.method6908());
		} else if (arg0 == 2) {
			this.aChar5 = Static448.method6635(arg1.method6908());
		} else if (arg0 == 3) {
			this.aString84 = arg1.method6903();
		} else if (arg0 == 4) {
			this.anInt9436 = arg1.method6865();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(41) int local41 = arg1.method6884();
			this.aClass222_38 = new Class222(Static347.method5404(local41));
			for (@Pc(51) int local51 = 0; local51 < local41; local51++) {
				@Pc(56) int local56 = arg1.method6865();
				@Pc(70) Class2 local70;
				if (arg0 == 5) {
					local70 = new Class2_Sub38(arg1.method6903());
				} else {
					local70 = new Class2_Sub15(arg1.method6865());
				}
				this.aClass222_38.method5476(local70, (long) local56);
			}
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V")
	private void method7882() {
		this.aClass222_39 = new Class222(this.aClass222_38.method5471());
		for (@Pc(18) Class2_Sub38 local18 = (Class2_Sub38) this.aClass222_38.method5474(); local18 != null; local18 = (Class2_Sub38) this.aClass222_38.method5472()) {
			@Pc(28) Class2_Sub39 local28 = new Class2_Sub39(local18.aString68, (int) local18.aLong287);
			this.aClass222_39.method5476(local28, Static323.method4877(local18.aString68));
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V")
	private void method7883() {
		this.aClass222_39 = new Class222(this.aClass222_38.method5471());
		for (@Pc(26) Class2_Sub15 local26 = (Class2_Sub15) this.aClass222_38.method5474(); local26 != null; local26 = (Class2_Sub15) this.aClass222_38.method5472()) {
			@Pc(34) Class2_Sub15 local34 = new Class2_Sub15((int) local26.aLong287);
			this.aClass222_39.method5476(local34, (long) local26.anInt1789);
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(ILclient!ud;)V")
	public void method7885(@OriginalArg(1) Class2_Sub34 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6904();
			if (local15 == 0) {
				return;
			}
			this.method7881(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "(II)Z")
	public boolean method7886(@OriginalArg(1) int arg0) {
		if (this.aClass222_38 == null) {
			return false;
		}
		if (this.aClass222_39 == null) {
			this.method7883();
		}
		@Pc(22) Class2_Sub15 local22 = (Class2_Sub15) this.aClass222_39.method5468((long) arg0);
		return local22 != null;
	}
}
