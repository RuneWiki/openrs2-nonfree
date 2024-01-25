import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class239 {

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
	public int anInt5974;

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "Lclient!qha;")
	public Class289 aClass289_4;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
	public int anInt5971 = 64;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
	public int anInt5972 = 1190717;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "Z")
	public boolean aBoolean431 = false;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
	public int anInt5970 = -1;

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
	public int anInt5973 = 8;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
	public int anInt5967 = 127;

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "Z")
	public boolean aBoolean433 = true;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
	public int anInt5976 = 512;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
	public int anInt5979 = -1;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
	public int anInt5977 = 0;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "Z")
	public boolean aBoolean430 = true;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!ofa;I)V")
	public void method5308(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5966();
			if (local5 == 0) {
				return;
			}
			this.method5311(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
	public void method5310() {
		this.anInt5973 = this.anInt5973 << 8 | this.anInt5974;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!ofa;II)V")
	private void method5311(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5977 = Static638.method9007(arg0.method5931());
		} else if (arg1 == 2) {
			this.anInt5979 = arg0.method5966();
		} else if (arg1 == 3) {
			this.anInt5979 = arg0.method5968();
			if (this.anInt5979 == 65535) {
				this.anInt5979 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean433 = false;
		} else if (arg1 == 7) {
			this.anInt5970 = Static638.method9007(arg0.method5931());
		} else if (arg1 == 8) {
			this.aClass289_4.anInt7734 = this.anInt5974;
		} else if (arg1 == 9) {
			this.anInt5976 = arg0.method5968() << 2;
		} else if (arg1 == 10) {
			this.aBoolean430 = false;
		} else if (arg1 == 11) {
			this.anInt5973 = arg0.method5966();
		} else if (arg1 == 12) {
			this.aBoolean431 = true;
		} else if (arg1 == 13) {
			this.anInt5972 = arg0.method5931();
		} else if (arg1 == 14) {
			this.anInt5971 = arg0.method5966() << 2;
		} else if (arg1 == 16) {
			this.anInt5967 = arg0.method5966();
		}
	}
}
