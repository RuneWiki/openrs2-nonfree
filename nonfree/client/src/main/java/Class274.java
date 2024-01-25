import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class274 {

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "Lclient!dka;")
	private final Class85 aClass85_48 = new Class85(64);

	@OriginalMember(owner = "client!oha", name = "e", descriptor = "Lclient!dka;")
	private final Class85 aClass85_49 = new Class85(100);

	@OriginalMember(owner = "client!oha", name = "f", descriptor = "Lclient!nca;")
	private final Class254 aClass254_121;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;Lclient!nca;Lclient!nca;)V")
	public Class274(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) Class254 arg3, @OriginalArg(4) Class254 arg4) {
		this.aClass254_121 = arg2;
		if (this.aClass254_121 != null) {
			@Pc(26) int local26 = this.aClass254_121.method6094() - 1;
			this.aClass254_121.method6101(local26);
		}
		Static704.method9419(arg4, arg3);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	public void method6620() {
		@Pc(2) Class85 local2 = this.aClass85_48;
		synchronized (this.aClass85_48) {
			this.aClass85_48.method1748();
		}
		local2 = this.aClass85_49;
		synchronized (this.aClass85_49) {
			this.aClass85_49.method1748();
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)V")
	public void method6621() {
		@Pc(2) Class85 local2 = this.aClass85_48;
		synchronized (this.aClass85_48) {
			this.aClass85_48.method1742(5);
		}
		local2 = this.aClass85_49;
		synchronized (this.aClass85_49) {
			this.aClass85_49.method1742(5);
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
	public void method6622() {
		@Pc(2) Class85 local2 = this.aClass85_48;
		synchronized (this.aClass85_48) {
			this.aClass85_48.method1741();
		}
		local2 = this.aClass85_49;
		synchronized (this.aClass85_49) {
			this.aClass85_49.method1741();
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZI)Lclient!pb;")
	public Class2_Sub6_Sub14 method6623(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_49;
		synchronized (this.aClass85_49) {
			@Pc(16) Class2_Sub6_Sub14 local16 = (Class2_Sub6_Sub14) this.aClass85_49.method1737((long) arg0);
			if (local16 == null) {
				local16 = new Class2_Sub6_Sub14(arg0);
				this.aClass85_49.method1745((long) arg0, 16383, local16);
			}
			return local16.method6814() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)Lclient!qea;")
	public Class307 method6626(@OriginalArg(1) int arg0) {
		@Pc(6) Class85 local6 = this.aClass85_48;
		@Pc(16) Class307 local16;
		synchronized (this.aClass85_48) {
			local16 = (Class307) this.aClass85_48.method1737((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class254 local30 = this.aClass254_121;
		@Pc(43) byte[] local43;
		synchronized (this.aClass254_121) {
			local43 = this.aClass254_121.method6087(Static328.method4566(arg0), Static215.method3000(arg0));
		}
		local16 = new Class307();
		local16.anInt8126 = arg0;
		if (local43 != null) {
			local16.method7250(new Class2_Sub20(local43));
		}
		local16.method7244();
		@Pc(81) Class85 local81 = this.aClass85_48;
		synchronized (this.aClass85_48) {
			this.aClass85_48.method1745((long) arg0, 16383, local16);
			return local16;
		}
	}
}
