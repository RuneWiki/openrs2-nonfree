import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class3_Sub7_Sub18 extends Class3_Sub7 {

	@OriginalMember(owner = "client!pv", name = "F", descriptor = "I")
	public int anInt8097 = 12800;

	@OriginalMember(owner = "client!pv", name = "B", descriptor = "I")
	public int anInt8101 = -1;

	@OriginalMember(owner = "client!pv", name = "J", descriptor = "I")
	public int anInt8102 = 12800;

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
	public int anInt8109 = -1;

	@OriginalMember(owner = "client!pv", name = "K", descriptor = "I")
	public int anInt8111 = 0;

	@OriginalMember(owner = "client!pv", name = "C", descriptor = "I")
	public int anInt8108 = 0;

	@OriginalMember(owner = "client!pv", name = "I", descriptor = "Z")
	public boolean aBoolean544 = true;

	@OriginalMember(owner = "client!pv", name = "D", descriptor = "I")
	public final int anInt8103;

	@OriginalMember(owner = "client!pv", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString98;

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
	public final int anInt8107;

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "Ljava/lang/String;")
	public String aString99;

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "Lclient!sja;")
	public final Class342 aClass342_63;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class3_Sub7_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt8103 = arg0;
		this.aString98 = arg1;
		this.anInt8107 = arg3;
		this.aBoolean544 = arg5;
		this.aString99 = arg2;
		this.anInt8109 = arg4;
		this.anInt8101 = arg6;
		if (this.anInt8101 == 255) {
			this.anInt8101 = 0;
		}
		this.aClass342_63 = new Class342();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IBII[I)Z")
	public boolean method6936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) Class3_Sub55 local11 = (Class3_Sub55) this.aClass342_63.method7644(); local11 != null; local11 = (Class3_Sub55) this.aClass342_63.method7650()) {
			if (local11.method8234(arg2, arg0, arg1)) {
				local11.method8238(arg3, arg2, arg1);
				return true;
			}
		}
		if (-18 != -18) {
			this.aBoolean544 = false;
		}
		return false;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZII[I)Z")
	public boolean method6937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(17) Class3_Sub55 local17 = (Class3_Sub55) this.aClass342_63.method7644(); local17 != null; local17 = (Class3_Sub55) this.aClass342_63.method7650()) {
			if (local17.method8236(arg1, arg0)) {
				local17.method8238(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)Z")
	public boolean method6938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class3_Sub55 local11 = (Class3_Sub55) this.aClass342_63.method7644(); local11 != null; local11 = (Class3_Sub55) this.aClass342_63.method7650()) {
			if (local11.method8236(arg0, arg2)) {
				return true;
			}
		}
		if (arg1 < 46) {
			this.aString99 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V")
	public void method6940() {
		this.anInt8108 = 0;
		this.anInt8111 = 0;
		this.anInt8097 = 12800;
		this.anInt8102 = 12800;
		for (@Pc(31) Class3_Sub55 local31 = (Class3_Sub55) this.aClass342_63.method7644(); local31 != null; local31 = (Class3_Sub55) this.aClass342_63.method7650()) {
			if (local31.anInt9671 < this.anInt8097) {
				this.anInt8097 = local31.anInt9671;
			}
			if (this.anInt8108 < local31.anInt9677) {
				this.anInt8108 = local31.anInt9677;
			}
			if (this.anInt8102 > local31.anInt9673) {
				this.anInt8102 = local31.anInt9673;
			}
			if (this.anInt8111 < local31.anInt9668) {
				this.anInt8111 = local31.anInt9668;
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[III)Z")
	public boolean method6942(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class3_Sub55 local19 = (Class3_Sub55) this.aClass342_63.method7644(); local19 != null; local19 = (Class3_Sub55) this.aClass342_63.method7650()) {
			if (local19.method8235(arg2, arg1)) {
				local19.method8232(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}
}
