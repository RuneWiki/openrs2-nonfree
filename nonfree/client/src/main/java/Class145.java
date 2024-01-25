import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class145 {

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
	public int anInt5347;

	@OriginalMember(owner = "client!iia", name = "e", descriptor = "I")
	private int anInt5349;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIII)Z")
	public boolean method4532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anInt5349;
		if (this.anInt5347 == arg2 && this.anInt5349 == 0) {
			return false;
		}
		@Pc(62) boolean local62;
		@Pc(48) int local48;
		if (this.anInt5349 == 0) {
			if (arg2 > this.anInt5347 && arg1 + this.anInt5347 >= arg2 || arg2 < this.anInt5347 && arg2 >= this.anInt5347 - arg1) {
				this.anInt5347 = arg2;
				return false;
			}
			local62 = true;
		} else {
			@Pc(53) int local53;
			if (this.anInt5349 > 0 && this.anInt5347 < arg2) {
				local48 = this.anInt5349 * this.anInt5349 / (arg1 * 2);
				local53 = local48 + this.anInt5347;
				if (local53 < arg2 && this.anInt5347 <= local53) {
					local62 = true;
				} else {
					local62 = false;
				}
			} else if (this.anInt5349 < 0 && arg2 < this.anInt5347) {
				local48 = this.anInt5349 * this.anInt5349 / (arg1 * 2);
				local53 = this.anInt5347 - local48;
				if (arg2 < local53 && this.anInt5347 >= local53) {
					local62 = true;
				} else {
					local62 = false;
				}
			} else {
				local62 = false;
			}
		}
		if (local62) {
			if (arg2 > this.anInt5347) {
				this.anInt5349 += arg1;
				if (arg0 != 0 && arg0 < this.anInt5349) {
					this.anInt5349 = arg0;
				}
			} else {
				this.anInt5349 -= arg1;
				if (arg0 != 0 && this.anInt5349 < -arg0) {
					this.anInt5349 = -arg0;
				}
			}
			if (this.anInt5349 != local8) {
				local48 = this.anInt5349 * this.anInt5349 / (arg1 * 2);
				if (arg2 > this.anInt5347) {
					if (local48 + this.anInt5347 > arg2) {
						this.anInt5349 = local8;
					}
				} else if (arg2 < this.anInt5347 && arg2 > this.anInt5347 - local48) {
					this.anInt5349 = local8;
				}
			}
		} else if (this.anInt5349 > 0) {
			this.anInt5349 -= arg1;
			if (this.anInt5349 < 0) {
				this.anInt5349 = 0;
			}
		} else {
			this.anInt5349 += arg1;
			if (this.anInt5349 > 0) {
				this.anInt5349 = 0;
			}
		}
		this.anInt5347 += local8 + this.anInt5349 >> 1;
		return local62;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
	public void method4533() {
		this.anInt5347 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IZ)V")
	public void method4534(@OriginalArg(0) int arg0) {
		this.anInt5347 = arg0;
		this.anInt5349 = 0;
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)I")
	public int method4535() {
		return this.anInt5347 & 0x3FFF;
	}
}
