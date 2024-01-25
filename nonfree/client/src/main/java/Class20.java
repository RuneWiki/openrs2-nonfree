import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class20 {

	@OriginalMember(owner = "client!am", name = "g", descriptor = "[J")
	public static final long[] aLongArray1 = new long[256];

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!ui;")
	private final Class359 aClass359_2 = new Class359(64);

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Lclient!lga;")
	private final Class223 aClass223_3;

	static {
		for (@Pc(185) int local185 = 0; local185 < 256; local185++) {
			@Pc(189) long local189 = (long) local185;
			for (@Pc(191) int local191 = 0; local191 < 8; local191++) {
				if ((local189 & 0x1L) == 1L) {
					local189 = local189 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local189 >>>= 0x1;
				}
			}
			aLongArray1[local185] = local189;
		}
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class20(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_3 = arg2;
		if (this.aClass223_3 != null) {
			this.aClass223_3.method5264(11);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V")
	public void method246() {
		@Pc(2) Class359 local2 = this.aClass359_2;
		synchronized (this.aClass359_2) {
			this.aClass359_2.method8502(5);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public void method247() {
		@Pc(6) Class359 local6 = this.aClass359_2;
		synchronized (this.aClass359_2) {
			this.aClass359_2.method8511();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public void method249() {
		@Pc(6) Class359 local6 = this.aClass359_2;
		synchronized (this.aClass359_2) {
			this.aClass359_2.method8507();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZI)Lclient!qm;")
	public Class302 method250(@OriginalArg(1) int arg0) {
		@Pc(6) Class359 local6 = this.aClass359_2;
		@Pc(16) Class302 local16;
		synchronized (this.aClass359_2) {
			local16 = (Class302) this.aClass359_2.method8517((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class223 local37 = this.aClass223_3;
		@Pc(46) byte[] local46;
		synchronized (this.aClass223_3) {
			local46 = this.aClass223_3.method5267(arg0, 11);
		}
		local16 = new Class302();
		if (local46 != null) {
			local16.method7333(new Class6_Sub15(local46));
		}
		@Pc(70) Class359 local70 = this.aClass359_2;
		synchronized (this.aClass359_2) {
			this.aClass359_2.method8515((long) arg0, local16);
			return local16;
		}
	}
}
