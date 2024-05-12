import sign.signlink;

public class Class9 {

	private boolean aBoolean87 = false;

	private int anInt379;

	private byte aByte21 = 12;

	private int anInt380 = 27808;

	private boolean aBoolean88 = true;

	public int anInt381;

	public int anInt382;

	public int anInt383;

	public int anInt384;

	public int[][] anIntArrayArray10;

	public Class9(int arg0, int arg1, int arg2) {
		try {
			while (arg1 >= 0) {
				this.aBoolean88 = !this.aBoolean88;
			}
			this.anInt381 = 0;
			this.anInt382 = 0;
			this.anInt383 = arg0;
			this.anInt384 = arg2;
			this.anIntArrayArray10 = new int[this.anInt383][this.anInt384];
			this.method249((byte) 74);
		} catch (RuntimeException var5) {
			signlink.reporterror("56319, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public void method249(byte arg0) {
		try {
			int var3;
			for (int var2 = 0; var2 < this.anInt383; ++var2) {
				for (var3 = 0; var3 < this.anInt384; ++var3) {
					if (var2 != 0 && var3 != 0 && var2 != this.anInt383 - 1 && var3 != this.anInt384 - 1) {
						this.anIntArrayArray10[var2][var3] = 0;
					} else {
						this.anIntArrayArray10[var2][var3] = 16777215;
					}
				}
			}
			if (arg0 != 74) {
				for (var3 = 1; var3 > 0; ++var3) {
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("82442, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method250(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		try {
			int var10 = arg3 - this.anInt381;
			if (!arg0) {
				this.aBoolean87 = !this.aBoolean87;
			}
			int var9 = arg2 - this.anInt382;
			if (arg5 == 0) {
				if (arg1 == 0) {
					this.method253(var10, var9, 128);
					this.method253(var10 - 1, var9, 8);
				}
				if (arg1 == 1) {
					this.method253(var10, var9, 2);
					this.method253(var10, var9 + 1, 32);
				}
				if (arg1 == 2) {
					this.method253(var10, var9, 8);
					this.method253(var10 + 1, var9, 128);
				}
				if (arg1 == 3) {
					this.method253(var10, var9, 32);
					this.method253(var10, var9 - 1, 2);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg1 == 0) {
					this.method253(var10, var9, 1);
					this.method253(var10 - 1, var9 + 1, 16);
				}
				if (arg1 == 1) {
					this.method253(var10, var9, 4);
					this.method253(var10 + 1, var9 + 1, 64);
				}
				if (arg1 == 2) {
					this.method253(var10, var9, 16);
					this.method253(var10 + 1, var9 - 1, 1);
				}
				if (arg1 == 3) {
					this.method253(var10, var9, 64);
					this.method253(var10 - 1, var9 - 1, 4);
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					this.method253(var10, var9, 130);
					this.method253(var10 - 1, var9, 8);
					this.method253(var10, var9 + 1, 32);
				}
				if (arg1 == 1) {
					this.method253(var10, var9, 10);
					this.method253(var10, var9 + 1, 32);
					this.method253(var10 + 1, var9, 128);
				}
				if (arg1 == 2) {
					this.method253(var10, var9, 40);
					this.method253(var10 + 1, var9, 128);
					this.method253(var10, var9 - 1, 2);
				}
				if (arg1 == 3) {
					this.method253(var10, var9, 160);
					this.method253(var10, var9 - 1, 2);
					this.method253(var10 - 1, var9, 8);
				}
			}
			if (arg4) {
				if (arg5 == 0) {
					if (arg1 == 0) {
						this.method253(var10, var9, 65536);
						this.method253(var10 - 1, var9, 4096);
					}
					if (arg1 == 1) {
						this.method253(var10, var9, 1024);
						this.method253(var10, var9 + 1, 16384);
					}
					if (arg1 == 2) {
						this.method253(var10, var9, 4096);
						this.method253(var10 + 1, var9, 65536);
					}
					if (arg1 == 3) {
						this.method253(var10, var9, 16384);
						this.method253(var10, var9 - 1, 1024);
					}
				}
				if (arg5 == 1 || arg5 == 3) {
					if (arg1 == 0) {
						this.method253(var10, var9, 512);
						this.method253(var10 - 1, var9 + 1, 8192);
					}
					if (arg1 == 1) {
						this.method253(var10, var9, 2048);
						this.method253(var10 + 1, var9 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method253(var10, var9, 8192);
						this.method253(var10 + 1, var9 - 1, 512);
					}
					if (arg1 == 3) {
						this.method253(var10, var9, 32768);
						this.method253(var10 - 1, var9 - 1, 2048);
					}
				}
				if (arg5 == 2) {
					if (arg1 == 0) {
						this.method253(var10, var9, 66560);
						this.method253(var10 - 1, var9, 4096);
						this.method253(var10, var9 + 1, 16384);
					}
					if (arg1 == 1) {
						this.method253(var10, var9, 5120);
						this.method253(var10, var9 + 1, 16384);
						this.method253(var10 + 1, var9, 65536);
					}
					if (arg1 == 2) {
						this.method253(var10, var9, 20480);
						this.method253(var10 + 1, var9, 65536);
						this.method253(var10, var9 - 1, 1024);
					}
					if (arg1 == 3) {
						this.method253(var10, var9, 81920);
						this.method253(var10, var9 - 1, 1024);
						this.method253(var10 - 1, var9, 4096);
						return;
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("61774, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public void method251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		try {
			int var8 = 256;
			if (arg6) {
				var8 += 131072;
			}
			int var12 = arg3 - this.anInt381;
			int var13 = arg5 - this.anInt382;
			int var9;
			if (arg0 == 1 || arg0 == 3) {
				var9 = arg2;
				arg2 = arg1;
				arg1 = var9;
			}
			int var10;
			for (var9 = var12; var9 < var12 + arg2; ++var9) {
				if (var9 >= 0 && var9 < this.anInt383) {
					for (var10 = var13; var10 < var13 + arg1; ++var10) {
						if (var10 >= 0 && var10 < this.anInt384) {
							this.method253(var9, var10, var8);
						}
					}
				}
			}
			if (arg4 != 9) {
				for (var10 = 1; var10 > 0; ++var10) {
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("17129, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	public void method252(byte arg0, int arg1, int arg2) {
		try {
			if (arg0 == this.aByte21) {
				int var7 = arg2 - this.anInt381;
				int var6 = arg1 - this.anInt382;
				this.anIntArrayArray10[var7][var6] |= 2097152;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("23195, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	private void method253(int arg0, int arg1, int arg2) {
		this.anIntArrayArray10[arg0][arg1] |= arg2;
	}

	public void method254(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			int var11 = 9 / arg4;
			int var9 = arg2 - this.anInt381;
			int var10 = arg3 - this.anInt382;
			if (arg5 == 0) {
				if (arg1 == 0) {
					this.method256(var10, (byte) -9, var9, 128);
					this.method256(var10, (byte) -9, var9 - 1, 8);
				}
				if (arg1 == 1) {
					this.method256(var10, (byte) -9, var9, 2);
					this.method256(var10 + 1, (byte) -9, var9, 32);
				}
				if (arg1 == 2) {
					this.method256(var10, (byte) -9, var9, 8);
					this.method256(var10, (byte) -9, var9 + 1, 128);
				}
				if (arg1 == 3) {
					this.method256(var10, (byte) -9, var9, 32);
					this.method256(var10 - 1, (byte) -9, var9, 2);
				}
			}
			if (arg5 == 1 || arg5 == 3) {
				if (arg1 == 0) {
					this.method256(var10, (byte) -9, var9, 1);
					this.method256(var10 + 1, (byte) -9, var9 - 1, 16);
				}
				if (arg1 == 1) {
					this.method256(var10, (byte) -9, var9, 4);
					this.method256(var10 + 1, (byte) -9, var9 + 1, 64);
				}
				if (arg1 == 2) {
					this.method256(var10, (byte) -9, var9, 16);
					this.method256(var10 - 1, (byte) -9, var9 + 1, 1);
				}
				if (arg1 == 3) {
					this.method256(var10, (byte) -9, var9, 64);
					this.method256(var10 - 1, (byte) -9, var9 - 1, 4);
				}
			}
			if (arg5 == 2) {
				if (arg1 == 0) {
					this.method256(var10, (byte) -9, var9, 130);
					this.method256(var10, (byte) -9, var9 - 1, 8);
					this.method256(var10 + 1, (byte) -9, var9, 32);
				}
				if (arg1 == 1) {
					this.method256(var10, (byte) -9, var9, 10);
					this.method256(var10 + 1, (byte) -9, var9, 32);
					this.method256(var10, (byte) -9, var9 + 1, 128);
				}
				if (arg1 == 2) {
					this.method256(var10, (byte) -9, var9, 40);
					this.method256(var10, (byte) -9, var9 + 1, 128);
					this.method256(var10 - 1, (byte) -9, var9, 2);
				}
				if (arg1 == 3) {
					this.method256(var10, (byte) -9, var9, 160);
					this.method256(var10 - 1, (byte) -9, var9, 2);
					this.method256(var10, (byte) -9, var9 - 1, 8);
				}
			}
			if (arg0) {
				if (arg5 == 0) {
					if (arg1 == 0) {
						this.method256(var10, (byte) -9, var9, 65536);
						this.method256(var10, (byte) -9, var9 - 1, 4096);
					}
					if (arg1 == 1) {
						this.method256(var10, (byte) -9, var9, 1024);
						this.method256(var10 + 1, (byte) -9, var9, 16384);
					}
					if (arg1 == 2) {
						this.method256(var10, (byte) -9, var9, 4096);
						this.method256(var10, (byte) -9, var9 + 1, 65536);
					}
					if (arg1 == 3) {
						this.method256(var10, (byte) -9, var9, 16384);
						this.method256(var10 - 1, (byte) -9, var9, 1024);
					}
				}
				if (arg5 == 1 || arg5 == 3) {
					if (arg1 == 0) {
						this.method256(var10, (byte) -9, var9, 512);
						this.method256(var10 + 1, (byte) -9, var9 - 1, 8192);
					}
					if (arg1 == 1) {
						this.method256(var10, (byte) -9, var9, 2048);
						this.method256(var10 + 1, (byte) -9, var9 + 1, 32768);
					}
					if (arg1 == 2) {
						this.method256(var10, (byte) -9, var9, 8192);
						this.method256(var10 - 1, (byte) -9, var9 + 1, 512);
					}
					if (arg1 == 3) {
						this.method256(var10, (byte) -9, var9, 32768);
						this.method256(var10 - 1, (byte) -9, var9 - 1, 2048);
					}
				}
				if (arg5 == 2) {
					if (arg1 == 0) {
						this.method256(var10, (byte) -9, var9, 66560);
						this.method256(var10, (byte) -9, var9 - 1, 4096);
						this.method256(var10 + 1, (byte) -9, var9, 16384);
					}
					if (arg1 == 1) {
						this.method256(var10, (byte) -9, var9, 5120);
						this.method256(var10 + 1, (byte) -9, var9, 16384);
						this.method256(var10, (byte) -9, var9 + 1, 65536);
					}
					if (arg1 == 2) {
						this.method256(var10, (byte) -9, var9, 20480);
						this.method256(var10, (byte) -9, var9 + 1, 65536);
						this.method256(var10 - 1, (byte) -9, var9, 1024);
					}
					if (arg1 == 3) {
						this.method256(var10, (byte) -9, var9, 81920);
						this.method256(var10 - 1, (byte) -9, var9, 1024);
						this.method256(var10, (byte) -9, var9 - 1, 4096);
						return;
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("76395, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public void method255(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
		try {
			int var8 = 256;
			if (arg5) {
				var8 += 131072;
			}
			int var13 = arg1 - this.anInt381;
			int var12 = arg0 - this.anInt382;
			if (!arg4) {
				this.anInt379 = 67;
			}
			int var9;
			if (arg2 == 1 || arg2 == 3) {
				var9 = arg3;
				arg3 = arg6;
				arg6 = var9;
			}
			for (var9 = var13; var9 < var13 + arg3; ++var9) {
				if (var9 >= 0 && var9 < this.anInt383) {
					for (int var10 = var12; var10 < var12 + arg6; ++var10) {
						if (var10 >= 0 && var10 < this.anInt384) {
							this.method256(var10, (byte) -9, var9, var8);
						}
					}
				}
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("21118, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}

	private void method256(int arg0, byte arg1, int arg2, int arg3) {
		try {
			this.anIntArrayArray10[arg2][arg0] &= 16777215 - arg3;
			if (arg1 == -9) {
				;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("67253, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method257(int arg0, int arg1, int arg2) {
		try {
			if (arg2 == 0) {
				int var7 = arg1 - this.anInt381;
				int var6 = arg0 - this.anInt382;
				this.anIntArrayArray10[var7][var6] &= 14680063;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("3785, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public boolean method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (arg6 == arg5 && arg4 == arg2) {
				return true;
			} else {
				int var13 = arg6 - this.anInt381;
				int var11 = arg4 - this.anInt382;
				if (arg0 != -7517) {
					throw new NullPointerException();
				} else {
					int var12 = arg5 - this.anInt381;
					int var10 = arg2 - this.anInt382;
					if (arg3 == 0) {
						if (arg1 == 0) {
							if (var13 == var12 - 1 && var11 == var10) {
								return true;
							}
							if (var13 == var12 && var11 == var10 + 1 && (this.anIntArrayArray10[var13][var11] & 2621728) == 0) {
								return true;
							}
							if (var13 == var12 && var11 == var10 - 1 && (this.anIntArrayArray10[var13][var11] & 2621698) == 0) {
								return true;
							}
						} else if (arg1 == 1) {
							if (var13 == var12 && var11 == var10 + 1) {
								return true;
							}
							if (var13 == var12 - 1 && var11 == var10 && (this.anIntArrayArray10[var13][var11] & 2621704) == 0) {
								return true;
							}
							if (var13 == var12 + 1 && var11 == var10 && (this.anIntArrayArray10[var13][var11] & 2621824) == 0) {
								return true;
							}
						} else if (arg1 == 2) {
							if (var13 == var12 + 1 && var11 == var10) {
								return true;
							}
							if (var13 == var12 && var11 == var10 + 1 && (this.anIntArrayArray10[var13][var11] & 2621728) == 0) {
								return true;
							}
							if (var13 == var12 && var11 == var10 - 1 && (this.anIntArrayArray10[var13][var11] & 2621698) == 0) {
								return true;
							}
						} else if (arg1 == 3) {
							if (var13 == var12 && var11 == var10 - 1) {
								return true;
							}
							if (var13 == var12 - 1 && var11 == var10 && (this.anIntArrayArray10[var13][var11] & 2621704) == 0) {
								return true;
							}
							if (var13 == var12 + 1 && var11 == var10 && (this.anIntArrayArray10[var13][var11] & 2621824) == 0) {
								return true;
							}
						}
					}
					if (arg3 == 2) {
						if (arg1 == 0) {
							if (var13 == var12 - 1 && var11 == var10) {
								return true;
							}
							if (var13 == var12 && var11 == var10 + 1) {
								return true;
							}
							if (var13 == var12 + 1 && var11 == var10 && (this.anIntArrayArray10[var13][var11] & 2621824) == 0) {
								return true;
							}
							if (var13 == var12 && var11 == var10 - 1 && (this.anIntArrayArray10[var13][var11] & 2621698) == 0) {
								return true;
							}
						} else if (arg1 == 1) {
							if (var13 == var12 - 1 && var11 == var10 && (this.anIntArrayArray10[var13][var11] & 2621704) == 0) {
								return true;
							}
							if (var13 == var12 && var11 == var10 + 1) {
								return true;
							}
							if (var13 == var12 + 1 && var11 == var10) {
								return true;
							}
							if (var13 == var12 && var11 == var10 - 1 && (this.anIntArrayArray10[var13][var11] & 2621698) == 0) {
								return true;
							}
						} else if (arg1 == 2) {
							if (var13 == var12 - 1 && var11 == var10 && (this.anIntArrayArray10[var13][var11] & 2621704) == 0) {
								return true;
							}
							if (var13 == var12 && var11 == var10 + 1 && (this.anIntArrayArray10[var13][var11] & 2621728) == 0) {
								return true;
							}
							if (var13 == var12 + 1 && var11 == var10) {
								return true;
							}
							if (var13 == var12 && var11 == var10 - 1) {
								return true;
							}
						} else if (arg1 == 3) {
							if (var13 == var12 - 1 && var11 == var10) {
								return true;
							}
							if (var13 == var12 && var11 == var10 + 1 && (this.anIntArrayArray10[var13][var11] & 2621728) == 0) {
								return true;
							}
							if (var13 == var12 + 1 && var11 == var10 && (this.anIntArrayArray10[var13][var11] & 2621824) == 0) {
								return true;
							}
							if (var13 == var12 && var11 == var10 - 1) {
								return true;
							}
						}
					}
					if (arg3 == 9) {
						if (var13 == var12 && var11 == var10 + 1 && (this.anIntArrayArray10[var13][var11] & 32) == 0) {
							return true;
						}
						if (var13 == var12 && var11 == var10 - 1 && (this.anIntArrayArray10[var13][var11] & 2) == 0) {
							return true;
						}
						if (var13 == var12 - 1 && var11 == var10 && (this.anIntArrayArray10[var13][var11] & 8) == 0) {
							return true;
						}
						if (var13 == var12 + 1 && var11 == var10 && (this.anIntArrayArray10[var13][var11] & 128) == 0) {
							return true;
						}
					}
					return false;
				}
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("67481, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public boolean method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		try {
			if (arg2 != this.anInt380) {
				this.anInt379 = -218;
			}
			if (arg3 == arg4 && arg5 == arg6) {
				return true;
			} else {
				int var10 = arg3 - this.anInt381;
				int var12 = arg5 - this.anInt382;
				int var11 = arg4 - this.anInt381;
				int var13 = arg6 - this.anInt382;
				if (arg1 == 6 || arg1 == 7) {
					if (arg1 == 7) {
						arg0 = arg0 + 2 & 3;
					}
					if (arg0 == 0) {
						if (var10 == var11 + 1 && var12 == var13 && (this.anIntArrayArray10[var10][var12] & 128) == 0) {
							return true;
						}
						if (var10 == var11 && var12 == var13 - 1 && (this.anIntArrayArray10[var10][var12] & 2) == 0) {
							return true;
						}
					} else if (arg0 == 1) {
						if (var10 == var11 - 1 && var12 == var13 && (this.anIntArrayArray10[var10][var12] & 8) == 0) {
							return true;
						}
						if (var10 == var11 && var12 == var13 - 1 && (this.anIntArrayArray10[var10][var12] & 2) == 0) {
							return true;
						}
					} else if (arg0 == 2) {
						if (var10 == var11 - 1 && var12 == var13 && (this.anIntArrayArray10[var10][var12] & 8) == 0) {
							return true;
						}
						if (var10 == var11 && var12 == var13 + 1 && (this.anIntArrayArray10[var10][var12] & 32) == 0) {
							return true;
						}
					} else if (arg0 == 3) {
						if (var10 == var11 + 1 && var12 == var13 && (this.anIntArrayArray10[var10][var12] & 128) == 0) {
							return true;
						}
						if (var10 == var11 && var12 == var13 + 1 && (this.anIntArrayArray10[var10][var12] & 32) == 0) {
							return true;
						}
					}
				}
				if (arg1 == 8) {
					if (var10 == var11 && var12 == var13 + 1 && (this.anIntArrayArray10[var10][var12] & 32) == 0) {
						return true;
					}
					if (var10 == var11 && var12 == var13 - 1 && (this.anIntArrayArray10[var10][var12] & 2) == 0) {
						return true;
					}
					if (var10 == var11 - 1 && var12 == var13 && (this.anIntArrayArray10[var10][var12] & 8) == 0) {
						return true;
					}
					if (var10 == var11 + 1 && var12 == var13 && (this.anIntArrayArray10[var10][var12] & 128) == 0) {
						return true;
					}
				}
				return false;
			}
		} catch (RuntimeException var9) {
			signlink.reporterror("20247, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + var9.toString());
			throw new RuntimeException();
		}
	}

	public boolean method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var9 = arg3 + arg6 - 1;
			int var10 = arg5 + arg1 - 1;
			int var12 = 17 / arg7;
			if (arg2 >= arg3 && arg2 <= var9 && arg0 >= arg5 && arg0 <= var10) {
				return true;
			} else if (arg2 == arg3 - 1 && arg0 >= arg5 && arg0 <= var10 && (this.anIntArrayArray10[arg2 - this.anInt381][arg0 - this.anInt382] & 8) == 0 && (arg4 & 8) == 0) {
				return true;
			} else if (arg2 == var9 + 1 && arg0 >= arg5 && arg0 <= var10 && (this.anIntArrayArray10[arg2 - this.anInt381][arg0 - this.anInt382] & 128) == 0 && (arg4 & 2) == 0) {
				return true;
			} else if (arg0 == arg5 - 1 && arg2 >= arg3 && arg2 <= var9 && (this.anIntArrayArray10[arg2 - this.anInt381][arg0 - this.anInt382] & 2) == 0 && (arg4 & 4) == 0) {
				return true;
			} else {
				return arg0 == var10 + 1 && arg2 >= arg3 && arg2 <= var9 && (this.anIntArrayArray10[arg2 - this.anInt381][arg0 - this.anInt382] & 32) == 0 && (arg4 & 1) == 0;
			}
		} catch (RuntimeException var11) {
			signlink.reporterror("71488, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var11.toString());
			throw new RuntimeException();
		}
	}
}
