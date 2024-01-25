import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class308 {

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
	public int anInt8039 = 0;

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
	public int anInt8040 = 0;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "Lclient!iha;")
	private final Class168 aClass168_70 = new Class168(64);

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "Lclient!hia;")
	private Interface16 anInterface16_1 = null;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "Lclient!gda;")
	private final Class126 aClass126_227;

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "Lclient!gda;")
	private final Class126 aClass126_228;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(ILclient!gda;Lclient!gda;Lclient!hia;)V")
	public Class308(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) Interface16 arg3) {
		this.aClass126_227 = arg1;
		this.anInterface16_1 = arg3;
		this.aClass126_228 = arg2;
		if (this.aClass126_227 != null) {
			this.anInt8040 = this.aClass126_227.method3062(1);
		}
		if (this.aClass126_228 != null) {
			this.anInt8039 = this.aClass126_228.method3062(1);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lclient!gr;")
	public Class5_Sub1_Sub5 method6953(@OriginalArg(0) int arg0) {
		@Pc(11) Class5_Sub1_Sub5 local11 = (Class5_Sub1_Sub5) this.aClass168_70.method3860((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(26) byte[] local26;
		if (arg0 < 32768) {
			local26 = this.aClass126_227.method3086(arg0, 1);
		} else {
			local26 = this.aClass126_228.method3086(arg0 & 0x7FFF, 1);
		}
		local11 = new Class5_Sub1_Sub5();
		local11.aClass308_2 = this;
		if (local26 != null) {
			local11.method3290(new Class5_Sub36(local26));
		}
		if (arg0 >= 32768) {
			local11.method3291();
		}
		this.aClass168_70.method3853((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(JZLclient!pe;[I)Ljava/lang/String;")
	public String method6955(@OriginalArg(0) long arg0, @OriginalArg(2) Class282 arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface16_1 != null) {
			@Pc(22) String local22 = this.anInterface16_1.method6396(arg1, arg2, arg0);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg0);
	}
}
