import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class40 {

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "Lclient!sb;")
	public Class296 aClass296_1;

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
	public int anInt1275;

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
	public int anInt1277;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ie;II)V")
	private void method1176(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1275 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt1277 = arg0.method6830();
		} else if (arg1 == 3) {
			this.aBoolean106 = true;
		} else if (arg1 == 4) {
			this.anInt1275 = -1;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)Z")
	public boolean method1177() {
		return this.aClass296_1.aClass284_139.method6347(this.anInt1275);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIZLclient!r;)Lclient!f;")
	public Class73 method1181(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class31 arg2) {
		@Pc(24) long local24 = (long) ((arg1 ? 262144 : 0) | arg0 << 16 | this.anInt1275 | arg2.anInt10222 << 19);
		@Pc(32) Class73 local32 = (Class73) this.aClass296_1.aClass342_170.method7684(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass296_1.aClass284_139.method6347(this.anInt1275)) {
			@Pc(59) Class365 local59 = Static607.method8163(this.aClass296_1.aClass284_139, this.anInt1275, 0);
			if (local59 != null) {
				local59.anInt10319 = local59.anInt10316 = local59.anInt10317 = local59.anInt10321 = 0;
				if (arg1) {
					local59.method8156();
				}
				for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
					local59.method8162();
				}
			}
			local32 = arg2.method8086(local59, true);
			if (local32 != null) {
				this.aClass296_1.aClass342_170.method7683(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZLclient!ie;)V")
	public void method1182(@OriginalArg(1) Class3_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6814();
			if (local5 == 0) {
				return;
			}
			this.method1176(arg0, local5);
		}
	}
}
