import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class2_Sub6_Sub7 extends Class2_Sub6 {

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt4448;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString51;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Lclient!vl;")
	public final Class388 aClass388_4;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub6_Sub7(@OriginalArg(0) String arg0) {
		this.aString51 = arg0;
		this.aClass388_4 = new Class388();
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)I")
	public int method4057() {
		return this.aClass388_4.aClass2_Sub6_66.aClass2_Sub6_64 == this.aClass388_4.aClass2_Sub6_66 ? -1 : ((Class2_Sub6_Sub20) this.aClass388_4.aClass2_Sub6_66.aClass2_Sub6_64).anInt9603;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!tt;)Z")
	public boolean method4059(@OriginalArg(1) Class2_Sub6_Sub20 arg0) {
		@Pc(7) int local7 = this.method4057();
		arg0.method8698();
		this.anInt4448--;
		if (this.anInt4448 != 0) {
			return local7 != this.method4057();
		}
		this.method9872();
		this.method8698();
		Static7.anInt82--;
		Static279.aClass85_31.method1745(arg0.aLong303, 16383, this);
		return false;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(ILclient!tt;)Z")
	public boolean method4061(@OriginalArg(1) Class2_Sub6_Sub20 arg0) {
		arg0.method8698();
		@Pc(10) boolean local10 = true;
		@Pc(26) Class2_Sub6_Sub20 local26 = (Class2_Sub6_Sub20) this.aClass388_4.method9213();
		while (local26 != null) {
			if (Static436.method6340(local26.anInt9603, arg0.anInt9603)) {
				Static446.method6524(local26, arg0);
				this.anInt4448++;
				if (local10) {
					return false;
				}
				return true;
			}
			local26 = (Class2_Sub6_Sub20) this.aClass388_4.method9212();
			local10 = false;
		}
		this.aClass388_4.method9215(arg0);
		this.anInt4448++;
		return local10;
	}
}
