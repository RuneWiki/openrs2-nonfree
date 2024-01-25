import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class5_Sub3_Sub15 extends Class5_Sub3 {

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
	public int anInt8017;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "Lclient!ut;")
	public final Class358 aClass358_7;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub3_Sub15(@OriginalArg(0) String arg0) {
		this.aString76 = arg0;
		this.aClass358_7 = new Class358();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)I")
	public int method6806() {
		return this.aClass358_7.aClass5_Sub3_60.aClass5_Sub3_66 == this.aClass358_7.aClass5_Sub3_60 ? -1 : ((Class5_Sub3_Sub20) this.aClass358_7.aClass5_Sub3_60.aClass5_Sub3_66).anInt10178;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!vba;I)Z")
	public boolean method6807(@OriginalArg(0) Class5_Sub3_Sub20 arg0) {
		arg0.method8687();
		@Pc(8) boolean local8 = true;
		@Pc(16) Class5_Sub3_Sub20 local16 = (Class5_Sub3_Sub20) this.aClass358_7.method8322();
		while (local16 != null) {
			if (Static527.method7438(local16.anInt10178, arg0.anInt10178)) {
				Static580.method8008(local16, arg0);
				this.anInt8017++;
				if (local8) {
					return false;
				}
				return true;
			}
			local16 = (Class5_Sub3_Sub20) this.aClass358_7.method8328();
			local8 = false;
		}
		this.aClass358_7.method8329(arg0);
		this.anInt8017++;
		return local8;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!vba;)Z")
	public boolean method6809(@OriginalArg(1) Class5_Sub3_Sub20 arg0) {
		@Pc(7) int local7 = this.method6806();
		arg0.method8687();
		this.anInt8017--;
		if (this.anInt8017 != 0) {
			return local7 != this.method6806();
		}
		this.method9052();
		this.method8687();
		Static248.anInt4552--;
		Static145.aClass340_16.method7986(arg0.aLong290, this);
		return false;
	}
}
