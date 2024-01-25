import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class8_Sub5_Sub6 extends Class8_Sub5 {

	@OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
	public int anInt3391;

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString37;

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "Lclient!sc;")
	public final Class302 aClass302_2;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class8_Sub5_Sub6(@OriginalArg(0) String arg0) {
		this.aString37 = arg0;
		this.aClass302_2 = new Class302();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!fh;)Z")
	public boolean method2814(@OriginalArg(1) Class8_Sub5_Sub7 arg0) {
		@Pc(7) int local7 = this.method2819();
		arg0.method8381();
		this.anInt3391--;
		if (this.anInt3391 != 0) {
			return local7 != this.method2819();
		}
		this.method8640();
		this.method8381();
		Static156.anInt3931--;
		Static565.aClass236_33.method6241(arg0.aLong92, this);
		return false;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(ILclient!fh;)Z")
	public boolean method2815(@OriginalArg(1) Class8_Sub5_Sub7 arg0) {
		@Pc(7) boolean local7 = true;
		arg0.method8381();
		for (@Pc(22) Class8_Sub5_Sub7 local22 = (Class8_Sub5_Sub7) this.aClass302_2.method7327(); local22 != null; local22 = (Class8_Sub5_Sub7) this.aClass302_2.method7326()) {
			if (Static243.method4439(local22.anInt3779, arg0.anInt3779)) {
				Static594.method8201(arg0, local22);
				this.anInt3391++;
				if (local7) {
					return false;
				}
				return true;
			}
			local7 = false;
		}
		this.aClass302_2.method7328(arg0);
		this.anInt3391++;
		return local7;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)I")
	public int method2819() {
		return this.aClass302_2.aClass8_Sub5_52 == this.aClass302_2.aClass8_Sub5_52.aClass8_Sub5_66 ? -1 : ((Class8_Sub5_Sub7) this.aClass302_2.aClass8_Sub5_52.aClass8_Sub5_66).anInt3779;
	}
}
