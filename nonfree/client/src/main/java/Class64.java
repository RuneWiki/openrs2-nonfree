import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class64 {

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!nc;")
	public Class233 aClass233_32;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public int anInt1735;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "I")
	public int anInt1736;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Z")
	public boolean aBoolean124 = false;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZILclient!ha;B)Lclient!fd;")
	public Class103 method1482(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		@Pc(29) long local29 = (long) (arg2.anInt7008 << 19 | (arg0 ? 262144 : 0) | arg1 << 16 | this.anInt1735);
		@Pc(37) Class103 local37 = (Class103) this.aClass233_32.aClass136_44.method3134(local29);
		if (local37 != null) {
			return local37;
		} else if (this.aClass233_32.aClass343_177.method8138(this.anInt1735)) {
			@Pc(59) Class251 local59 = Static656.method6331(this.aClass233_32.aClass343_177, this.anInt1735, 0);
			if (local59 != null) {
				local59.anInt7182 = local59.anInt7183 = local59.anInt7181 = local59.anInt7180 = 0;
				if (arg0) {
					local59.method6335();
				}
				for (@Pc(79) int local79 = 0; local79 < arg1; local79++) {
					local59.method6343();
				}
			}
			local37 = arg2.method6106(local59, true);
			if (local37 != null) {
				this.aClass233_32.aClass136_44.method3135(local37, local29);
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!dc;)V")
	public void method1483(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5633();
			if (local5 == 0) {
				return;
			}
			this.method1484(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!dc;I)V")
	private void method1484(@OriginalArg(1) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1735 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt1736 = arg0.method5604();
		} else if (arg1 == 3) {
			this.aBoolean124 = true;
		} else if (arg1 == 4) {
			this.anInt1735 = -1;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Z")
	public boolean method1486() {
		return this.aClass233_32.aClass343_177.method8138(this.anInt1735);
	}
}
